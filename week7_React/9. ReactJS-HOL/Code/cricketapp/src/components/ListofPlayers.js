const ListofPlayers = () => {
  const players = [
    { id: 1, name: 'Jack', score: 50 },
    { id: 2, name: 'Michael', score: 70 },
    { id: 3, name: 'John', score: 40 },
    { id: 4, name: 'Ann', score: 61 },
    { id: 5, name: 'Elisabeth', score: 61 },
    { id: 6, name: 'Sachin', score: 95 },
    { id: 7, name: 'Dhoni', score: 100 },
    { id: 8, name: 'Virat', score: 84 },
    { id: 9, name: 'Jadeja', score: 64 },
    { id: 10, name: 'Raina', score: 75 },
    { id: 11, name: 'Rohit', score: 80 },
  ];

  const playersBelow70 = players.filter(player => player.score < 70);

  return (
    <div>
      <h2>List of Players</h2>
      <ul>
        {players.map(item => (
          <li key={item.id}>
            Mr. {item.name} <span>{item.score}</span>
          </li>
        ))}
      </ul>

      <h2>List of Players having Scores Less than 70</h2>
      <ul>
        {playersBelow70.map(item => (
          <li key={item.id}>
            Mr. {item.name} <span>{item.score}</span>
          </li>
        ))}
      </ul>
    </div>
  );
};

export default ListofPlayers;