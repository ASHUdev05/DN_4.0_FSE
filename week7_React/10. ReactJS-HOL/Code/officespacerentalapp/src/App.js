import Header from './components/Header';
import OfficeCard from './components/Card';

function App() {
  const officeSpaces = [
    {
      id: 1,
      name: "DBS Tower",
      rent: 50000,
      address: "Chennai",
      imageUrl: `https://placehold.co/400x250/E0F2F7/000000?text=Office+Space+Chennai`
    },
    {
      id: 2,
      name: "Tech Hub Center",
      rent: 75000,
      address: "Bangalore",
      imageUrl: `https://placehold.co/400x250/E0F2F7/000000?text=Office+Space+Bangalore`
    },
    {
      id: 3,
      name: "Innovation Park",
      rent: 45000,
      address: "Hyderabad",
      imageUrl: `https://placehold.co/400x250/E0F2F7/000000?text=Office+Space+Hyderabad`
    },
    {
      id: 4,
      name: "Corporate Suites",
      rent: 62000,
      address: "Mumbai",
      imageUrl: `https://placehold.co/400x250/E0F2F7/000000?text=Office+Space+Mumbai`
    }
  ];

  return (
    <div className="min-h-screen bg-gray-100 p-4 sm:p-6 lg:p-8 font-inter">
      <Header />

      <div className="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-6 max-w-6xl mx-auto">
        {officeSpaces.map((office) => (
          <OfficeCard key={office.id} office={office} />
        ))}
      </div>
    </div>
  );
}

export default App;
