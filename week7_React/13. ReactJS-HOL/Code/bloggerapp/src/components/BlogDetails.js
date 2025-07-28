import React from 'react';
import './BlogDetails.css';

function BlogDetails() {
  const content = (
    <div>
      <h3>React Learning</h3>
      <h4>Stephen Biz</h4>
      <p>Welcome to learning React!</p>
      <h3>Installation</h3>
      <h4>Schewzdenier</h4>
      <p>You can install React from npm.</p>
    </div>
  );

  return (
    <div className="blog-details">
      <h1>Blog Details</h1>
      {content}
    </div>
  );
}

export default BlogDetails;