import React, { useState } from 'react';
import './CurrencyConvertor.css';

function CurrencyConvertor({ buttonStyle }) {
  const [amount, setAmount] = useState('');
  const [currency, setCurrency] = useState('');
  const INR_TO_EURO_RATE = 0.011;

  const handleAmountChange = (event) => {
    setAmount(event.target.value);
  };

  const handleSubmit = (event) => {
    const inr = parseFloat(amount);
    if (!isNaN(inr) && inr >= 0) {
      const euro = inr * INR_TO_EURO_RATE;
      setCurrency('Euro');
      alert(`Converting to Euro Amount is ${euro.toFixed(0)}`);
    } else {
      setCurrency('');
      alert('Please enter a valid positive number for Amount.');
    }
  };

  return (
    <div className="currency-converter-container">
      <h2 className="currency-converter-title">Currency Convertor!!!</h2>
      <div className="input-group">
        <label htmlFor="amount" className="input-label">Amount:</label>
        <input
          type="number"
          id="amount"
          value={amount}
          onChange={handleAmountChange}
          className="input-field"
        />
      </div>
      <div className="input-group">
        <label htmlFor="currency" className="input-label">Currency:</label>
        <input
          type="text"
          id="currency"
          value={currency}
          readOnly
          className="input-field"
        />
      </div>
      <button
        onClick={handleSubmit}
        style={buttonStyle}
      >
        Submit
      </button>
    </div>
  );
}

export default CurrencyConvertor;
