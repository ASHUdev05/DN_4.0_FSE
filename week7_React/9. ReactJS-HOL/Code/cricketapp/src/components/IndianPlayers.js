const IndianPlayers = () => {
  const IndianTeam = [
    'Sachin1', 'Dhoni2', 'Virat3', 'Rohit4', 'Yuvraj5', 'Raina6'
  ];

  const [firstOdd, , thirdOdd, , fifthOdd] = IndianTeam;
  const oddPlayers = [firstOdd, thirdOdd, fifthOdd].filter(Boolean);

  const [, firstEven, , thirdEven, , fifthEven] = IndianTeam;
  const evenPlayers = [firstEven, thirdEven, fifthEven].filter(Boolean);

  const T20Players = ['First Player', 'Second Player', 'Third Player'];
  const RanjiTrophyPlayers = ['Fourth Player', 'Fifth Player', 'Sixth Player'];

  const allIndianPlayers = [...T20Players, ...RanjiTrophyPlayers];

  return (
    <div>
      <h2>Odd Players</h2>
      <ul>
        {oddPlayers.map((player, index) => (
          <li key={index}>
            {index === 0 && 'First : '}{index === 1 && 'Third : '}{index === 2 && 'Fifth : '}{player}
          </li>
        ))}
      </ul>

      <h2>Even Players</h2>
      <ul>
        {evenPlayers.map((player, index) => (
          <li key={index}>
            {index === 0 && 'Second : '}{index === 1 && 'Fourth : '}{index === 2 && 'Sixth : '}{player}
          </li>
        ))}
      </ul>

      <h2>List of Indian Players Merged:</h2>
      <ul>
        {allIndianPlayers.map((player, index) => (
          <li key={index}>Mr. {player}</li>
        ))}
      </ul>
    </div>
  );
};

export default IndianPlayers;