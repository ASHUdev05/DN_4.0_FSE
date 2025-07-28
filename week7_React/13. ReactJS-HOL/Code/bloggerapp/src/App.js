import React from 'react';
import './App.css';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import CourseDetails from './components/CourseDetails';

function App() {
  const showBookDetails = true;
  const showBlogDetails = true;
  const showCourseDetails = true;

  return (
    <div className="App">
      <div className="container">
        {showCourseDetails && (
          <div className="component-wrapper">
            <CourseDetails />
          </div>
        )}
        {showBookDetails && (
          <div className="component-wrapper">
            <BookDetails />
          </div>
        )}
        {showBlogDetails && (
          <div className="component-wrapper">
            <BlogDetails />
          </div>
        )}
      </div>
    </div>
  );
}

export default App;