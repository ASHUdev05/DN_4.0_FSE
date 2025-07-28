import React, { useState } from 'react';
import LoginButton from './components/LoginButton';
import LogoutButton from './components/LogoutButton';
import './App.css';

function UserGreeting() {
  return <h1 className="text-4xl font-bold mb-4">Welcome back</h1>;
}

function GuestGreeting() {
  return <h1 className="text-4xl font-bold mb-4">Please sign up.</h1>;
}

function Greeting(props) {
  const isLoggedIn = props.isLoggedIn;
  if (isLoggedIn) {
    return <UserGreeting />;
  }
  return <GuestGreeting />;
}

export default function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLoginClick = () => {
    setIsLoggedIn(true);
  };

  const handleLogoutClick = () => {
    setIsLoggedIn(false);
  };

  let button;
  if (isLoggedIn) {
    button = <LogoutButton onClick={handleLogoutClick} />;
  } else {
    button = <LoginButton onClick={handleLoginClick} />;
  }

  return (
    <div className="App font-sans">
      <div className="App-content">
        <Greeting isLoggedIn={isLoggedIn} />
        {button}
      </div>
    </div>
  );
}

