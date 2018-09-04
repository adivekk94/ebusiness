import React, {Component} from 'react';
import {Nav, Image, Navbar, NavDropdown, MenuItem} from 'react-bootstrap';
import "../style/style.css";

const fbLogoUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/c/cd/Facebook_logo_%28square%29.png/600px-Facebook_logo_%28square%29.png";
const basketLogoUrl = "https://pl.seaicons.com/wp-content/uploads/2017/02/shopping-basket-icon.png";
class Login extends Component {

    constructor() {
    super()
    this.changeView = this
      .changeView
      .bind(this)
  }

  changeView(stateID) {
    this
      .props
      .switchView(stateID)
  }

  render() {
    if (!this.props.firstName) {
      return (
        <Navbar.Collapse>
          <Nav pullRight>
            <Navbar.Text>
              <div class="loginUsing">Login using <a href="http://localhost:9000/authenticate/facebook"><img src={fbLogoUrl} height="30" alt="facebook"/></a></div>
            </Navbar.Text>
          </Nav>
        </Navbar.Collapse >

      );
    } else {
      return (
        <Navbar.Collapse>
          <Nav>
            <NavDropdown eventKey={1} title="Add" id="basic-nav-dropdown">
              <MenuItem eventKey={1.1} onClick={this.changeView.bind(this, 2)}>Category</MenuItem>
              <MenuItem eventKey={1.2} onClick={this.changeView.bind(this, 3)}>Product</MenuItem>
            </NavDropdown>
          </Nav>
          <Nav>
            <Navbar.Text onClick={this.changeView.bind(this, 4)} id="categoriesView">
              Categories
            </Navbar.Text>
          </Nav>
          <Nav pullRight>
            <Navbar.Text pullRight>
              <div class="welcome">Welcome <i>{this.props.firstName.substring(5, this.props.firstName.length - 1)} {this.props.lastName.substring(5, this.props.lastName.length - 1)}</i>!</div>
              <a href="http://localhost:3000">Logout</a>
            </Navbar.Text> 
            <Image
              src={this
              .props
              .avatarUrl
              .substring(5, this.props.avatarUrl.length - 1)}
              circle thumbnail/>
          </Nav>
          <Nav pullRight>
            <Navbar.Text id="basketMain">
              <div><img id="basketLogo" src={basketLogoUrl} height="30" onClick={this.changeView.bind(this, 1)} alt="basket"/>  Items in basket: {this.props.basketData}</div>
            </Navbar.Text>
          </Nav>
        </Navbar.Collapse>
      );
    }
  }
};
export {Login}