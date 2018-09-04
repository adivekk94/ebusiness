import React, {Component} from 'react';
import {Navbar} from 'react-bootstrap';
import {Login} from './Login';
import "../style/style.css";

const shopLogoUrl = "https://pixabay.com/get/e832b90b2df3023ed1584d05fb0938c9bd22ffd41cb217419df6c07ba1/controller-1784573_1280.png";

class Header extends Component {

  constructor() {
    super()
    this.changeView = this
      .changeView
      .bind(this)
  }

  changeView() {
    this.props.switchView(0)
  }

  render() {
    return (
      <Navbar inverse collapseOnSelect fixedTop >
        <Navbar.Header>
          <Navbar.Brand >
            <div id="shopAll"><a className="shop" onClick={this.changeView}><img align="bottom" alt="" src={shopLogoUrl} width="30"/><i><b>Shop</b></i></a></div>
          </Navbar.Brand>
          <Navbar.Toggle/>
        </Navbar.Header>
        <Login
          firstName={this.props.loginData.firstName}
          lastName={this.props.loginData.lastName}
          avatarUrl=
          {this.props.loginData.avatarUrl + "&height=" + this.props.loginData.height + "&width=" + this.props.loginData.width + "&ext=" + this.props.loginData.ext + "&hash=" + this.props.loginData.hash}
          basketData={this.props.basketData}
          switchView={this.props.switchView}/>
      </Navbar>
    );
  }
};
export {Header}