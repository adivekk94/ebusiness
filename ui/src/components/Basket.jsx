import React, {Component} from 'react';
import {getBasket} from '../utils/get-api';
import {getProduct} from '../utils/get-api';
import {deleteFromBasket} from '../utils/delete-api';

const removeLogoUrl = "https://png2.kisspng.com/20180401/hle/kisspng-web-development-amazon-com-shopping-cart-e-commerc-add-to-cart-button-5ac189c84a97c3.2416793915226331603055.png"

class Basket extends Component {

  constructor() {
    super()
    this.state = {
      basketItems: [],
      basket: []
    };
    this.getBasket = this
      .getBasket
      .bind(this);
    this.removeItem = this
      .removeItem
      .bind(this);
  }

  removeItem(product_id) {
    deleteFromBasket(product_id).then((result) => {
      this.getBasket()
      this.props.basketChanged()
    })

  }

  getBasket() {
    this.setState({basketItems: [], basket: []})
    getBasket().then((basket) => {
      this.setState({basketItems: basket})
      basket.map((item, index) => (getProduct(item.product_id).then((product) => {
        this.setState({
          basket: this.state.basket.concat([product])
        })
      })))
    });
  }

  renderNoItemsIfNecessary(basket) {
    if(basket.length === 0)
    {
      return <h3 className="text-center"><i>No items in basket</i></h3>
    }
  }

  componentDidMount() {
    this.getBasket();
  }

  render() {
    const {basket} = this.state;
    return (
      <div>
        <h3 className="text-center"><b>Basket</b></h3>
        {this.renderNoItemsIfNecessary(basket)}
        <hr/> {basket.map((product, index) => (
          <div className="col-sm-6" key={index}>
            <div className="panel panel-primary">
              <div className="panel-heading">
                <h3 className="panel-title">
                  <img id="addButton" src={removeLogoUrl} onClick={this.removeItem.bind(this, this.state.basketItems[index].id)} width="30" alt="remove"/> <b>{product.name}</b>
                </h3>
              </div>
              <div className="panel-body">
                <p align="center" id="productDesc">
                  {product.description}
                </p>
                <p>
                  <br></br>
                  <i>Key words: {product.key_words}</i>
                </p>
              </div>
            </div>
          </div>
        ))}
      </div>
    );
  }
}

export {Basket};