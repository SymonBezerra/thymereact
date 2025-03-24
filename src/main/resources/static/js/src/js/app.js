import ProductList from "./productList.js";

import React from "react";
import ReactDOM from 'react-dom/client';

const App = () => {
    return (
        <div>
            <div className="flex justify-center">
                <h1 className="p-5 text-blue-500 text-2xl">Product List</h1>
            </div>
            <ProductList products={ productsData } />
            <div></div>
            <div className="flex justify-center mt-5">
                <a href="/products/create" className="p-3 text-white bg-blue-500 rounded-lg">Add Product</a>
            </div>
        </div>
    );
};

const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(<App />);
