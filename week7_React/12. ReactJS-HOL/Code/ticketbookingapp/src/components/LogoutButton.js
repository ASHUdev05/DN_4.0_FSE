import React from 'react';

export default function LogoutButton(props) {
  return (
    <button
      onClick={props.onClick}
      className="bg-red-500 hover:bg-red-700 text-white font-bold py-2 px-4 rounded-lg shadow-md transition duration-300 ease-in-out transform hover:scale-105"
    >
      Logout
    </button>
  );
}
