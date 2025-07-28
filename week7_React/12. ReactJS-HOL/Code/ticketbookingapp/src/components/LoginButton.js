import React from 'react';

export default function LoginButton(props) {
  return (
    <button
      onClick={props.onClick}
      className="bg-blue-500 hover:bg-blue-700 text-white font-bold py-2 px-4 rounded-lg shadow-md transition duration-300 ease-in-out transform hover:scale-105"
    >
      Login
    </button>
  );
}
