import React from 'react';
import './CourseDetails.css';

function CourseDetails() {
  const coursedet = (
    <div>
      <h3>Angular</h3>
      <h4>4/5/2021</h4>
      <h3>React</h3>
      <h4>6/3/2020</h4>
    </div>
  );

  return (
    <div className="course-details">
      <h1>Course Details</h1>
      {coursedet}
    </div>
  );
}

export default CourseDetails;