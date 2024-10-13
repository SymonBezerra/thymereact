const ProductList = ({ products }) => {
    return (
        <div className="mx-10 p-10 border border-blue-500">
            {products.length === 0 ? (
                <p>No products to show</p>
            ) : (
                <ul>
                    {products.map((product, index) => (
                        <li key={index}>
                            <h2 className="text-xl text-gray-700">{product.name}</h2>
                            <p className="text-gray-500">{product.description}</p>
                            <span className="text-green-500">Price: ${product.price}</span>
                            <div></div>
                            <button className="p-3 bg-red-500 my-5 rounded-lg text-white" onClick={async function name(params) {
                                await handleDelete(product.id);
                            }}>Delete</button>
                            <hr className="mb-3"/>
                        </li>
                    ))}
                </ul>
            )}
        </div>
    );
}

Window.ProductList = ProductList;