import "./App.css";
import MainMenu from "./components/mainmenu/MainMenu";
import Category from "./components/category/Category";
import Header from "./components/header/Header";
import { createGlobalStyle } from "styled-components";
const GlobalStyle = createGlobalStyle`
body{
  width: 1440px;
  font-family: Noto Sans KR;
  margin: 0 auto;
}
button{
  border: none;
  background-color: transparent;
  &:focus {
    outline: none;
  }
  cursor: pointer;
}
ul{
  padding: 0;
}
li{
  list-style: none;
  }
`;

function App() {
  return (
    <>
      <GlobalStyle />
      <Header />
      <MainMenu />
      <Category />
    </>
  );
}

export default App;
