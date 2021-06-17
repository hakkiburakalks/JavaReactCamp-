import './App.css';
import 'semantic-ui-css/semantic.min.css'
import Navi from './Layouts/Navi';
import Dashboard from './Layouts/Dashboard';
function App() {
  return (
    <div className="App">
     <Navi></Navi>
     <Dashboard></Dashboard>
    </div>
  );
}

export default App;
