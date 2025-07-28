import React, { useState } from 'react';
import CurrencyConverter from './components/CurrencyConvertor';
import './App.css';

function App() {
  const [counter, setCounter] = useState(0);

  const incrementCounter = () => {
    setCounter(prevCounter => prevCounter + 1);
    console.log('Counter incremented!');
  };

  const sayHello = () => {
    console.log('Hello from sayHello!');
    alert('Hello! Member!');
  };

  const handleIncreaseClick = () => {
    incrementCounter();
    sayHello();
  };

  const decrementCounter = () => {
    setCounter(prevCounter => prevCounter - 1);
    console.log('Counter decremented!');
  };

  const sayWelcome = (message) => {
    alert(message);
    console.log(`Invoked with argument: ${message}`);
  };

  const handleSyntheticClick = (event) => {
    console.log('Synthetic event triggered:', event);
    alert('I was clicked');
  };

  return (
    <div className="app-container">
      <div className="section-container">
        <p className="counter-display">{counter}</p>
        <button onClick={handleIncreaseClick} className="button-style">
          Increment
        </button>
        <br />
        <button onClick={decrementCounter} className="button-style">
          Decrement
        </button>
      </div>

      <div className="section-container">
        <button
          onClick={() => sayWelcome('welcome')}
          className="button-style"
        >
          Say welcome
        </button>
      </div>

      <div className="section-container">
        <button onClick={handleSyntheticClick} className="button-style">
          Click on me
        </button>
      </div>

      <CurrencyConverter buttonStyle={{}} />
    </div>
  );
}

export default App;
