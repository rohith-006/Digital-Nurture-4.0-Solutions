import './App.css';
import {CalculateScore, Calculator} from "./Components/CalculateScore";

function App() {
  return (
    <div className="App">
      <CalculateScore Name={"Rohith"} goal={4} total={300} School={"DPS Public School"} />
    </div>
  );
}

export default App;
