import './App.css';
import Dashboard from './layouts/Dashboard';
import 'semantic-ui-css/semantic.min.css'
import { Container } from 'semantic-ui-react';
import Navi from './layouts/Navi';
import ProductList from './pages/ProductList';
function App() {
  return (
    <div className="App">
      <Navi></Navi>
      <Container><Dashboard>
      </Dashboard>
      </Container>
    </div>
  );
}

export default App;
