import React from "react";
import Post from "./Post";

class Posts extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            posts: [],
            hasError: false
        };
    }

    loadPosts() {
        fetch('https://jsonplaceholder.typicode.com/posts')
            .then(res => res.json())
            .then(data => {
                const postObjects = data.map(post => new Post(post.id, post.title, post.body));
                this.setState({ posts: postObjects });
            })
            .catch(error => {
                this.setState({ hasError: true });
                alert('Error fetching posts: ' + error.message);
            });
    }

    componentDidMount() {
        this.loadPosts();
    }

    render() {
        if (this.state.hasError) {
            return <h2>Something went wrong.</h2>;
        }

        return (
            <div>
                <h2>Blog Posts</h2>
                {this.state.posts.map(post => (
                    <div key={post.id}>
                        <h3>{post.title}</h3>
                        <p>{post.body}</p>
                        <hr />
                    </div>
                ))}
            </div>
        );
    }

    componentDidCatch(error, info) {
        this.setState({ hasError: true });
        alert("An error occured: " + error.toString() + " due to: " + info.toString());
    }
}

export default Posts;