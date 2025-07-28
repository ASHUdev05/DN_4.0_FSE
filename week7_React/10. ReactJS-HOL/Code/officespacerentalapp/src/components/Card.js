import React, { useState } from 'react';
import './Card.css';

function OfficeCard({ office }) {
  const [imageError, setImageError] = useState(false);

  const rentClassName = office.rent <= 60000 ? 'rent-red' : 'rent-green';

  const handleImageError = () => {
    setImageError(true);
  };

  const imageUrl = office.imageUrl;

  return (
    <div className="office-card">
      {imageError ? (
        <div className="office-card-image-fallback">
          <svg className="fallback-icon" viewBox="0 0 24 24" fill="none" stroke="currentColor" strokeWidth="2" strokeLinecap="round" strokeLinejoin="round">
            <path d="M4 16l4-4 4 4 4-4 4 4M12 12V4" />
          </svg>
          <p className="fallback-text">Image could not be loaded</p>
        </div>
      ) : (
        <img
          src={imageUrl}
          alt={`${office.name}`}
          className="office-card-image"
          onError={handleImageError}
        />
      )}

      <div className="office-card-details">
        <h2 className="office-card-name">
          Name: {office.name}
        </h2>

        <h3 className="office-card-rent">
          Rent: Rs.{" "}
          <span className={rentClassName}>
            {office.rent.toLocaleString()}
          </span>
        </h3>

        <h3 className="office-card-address">
          Address: {office.address}
        </h3>
      </div>
    </div>
  );
}

export default OfficeCard;
