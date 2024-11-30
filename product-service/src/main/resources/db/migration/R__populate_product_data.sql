-- Clear the table before inserting new data
TRUNCATE TABLE t_product RESTART IDENTITY CASCADE;

INSERT INTO t_product (id, number, name, description, category, price) VALUES
-- Category: ELECTRONICS
(1, 'PROD001', 'Smartphone X', 'A high-end smartphone with an amazing display.', 'ELECTRONICS', 799.99),
(2, 'PROD002', 'Laptop Pro 15', 'A powerful laptop for professionals.', 'ELECTRONICS', 1299.99),
(3, 'PROD003', 'Wireless Headphones', 'Noise-canceling wireless headphones.', 'ELECTRONICS', 199.99),
(4, 'PROD004', '4K Smart TV', 'A 55-inch 4K UHD Smart TV.', 'ELECTRONICS', 599.99),
(5, 'PROD005', 'Bluetooth Speaker', 'Portable speaker with excellent sound quality.', 'ELECTRONICS', 89.99),
(6, 'PROD006', 'Gaming Console', 'Next-gen gaming console with stunning graphics.', 'ELECTRONICS', 499.99),
(7, 'PROD007', 'Smartwatch', 'Feature-rich smartwatch with health tracking.', 'ELECTRONICS', 249.99),
(8, 'PROD008', 'Drone X200', 'High-performance drone with a 4K camera.', 'ELECTRONICS', 699.99),
(9, 'PROD009', 'Tablet Pro', 'A sleek tablet with a stunning display.', 'ELECTRONICS', 399.99),
(10, 'PROD010', 'Digital Camera', 'Professional digital camera with 20MP sensor.', 'ELECTRONICS', 899.99),

-- Category: FURNITURE
(11, 'PROD011', 'Office Chair', 'Ergonomic office chair with lumbar support.', 'FURNITURE', 149.99),
(12, 'PROD012', 'Wooden Desk', 'Spacious wooden desk for home offices.', 'FURNITURE', 299.99),
(13, 'PROD013', 'Bookshelf', 'Sturdy bookshelf with a modern design.', 'FURNITURE', 99.99),
(14, 'PROD014', 'Dining Table', '6-person dining table made of oak.', 'FURNITURE', 499.99),
(15, 'PROD015', 'Recliner Sofa', 'Comfortable recliner sofa with leather finish.', 'FURNITURE', 799.99),
(16, 'PROD016', 'Bed Frame', 'Queen-size bed frame with storage drawers.', 'FURNITURE', 599.99),
(17, 'PROD017', 'Nightstand', 'Compact nightstand with a drawer.', 'FURNITURE', 69.99),
(18, 'PROD018', 'Coffee Table', 'Modern coffee table with a glass top.', 'FURNITURE', 199.99),
(19, 'PROD019', 'TV Stand', 'Stylish TV stand with ample storage.', 'FURNITURE', 249.99),
(20, 'PROD020', 'Wardrobe', 'Spacious wardrobe with sliding doors.', 'FURNITURE', 899.99),

-- Category: CLOTHING
(21, 'PROD021', 'Casual T-Shirt', 'Comfortable cotton t-shirt.', 'CLOTHING', 19.99),
(22, 'PROD022', 'Jeans Slim Fit', 'Stylish slim-fit denim jeans.', 'CLOTHING', 49.99),
(23, 'PROD023', 'Leather Jacket', 'Premium leather jacket for all seasons.', 'CLOTHING', 249.99),
(24, 'PROD024', 'Sneakers', 'Lightweight and durable sneakers.', 'CLOTHING', 79.99),
(25, 'PROD025', 'Wool Sweater', 'Cozy wool sweater for cold weather.', 'CLOTHING', 59.99),
(26, 'PROD026', 'Summer Dress', 'Elegant summer dress with floral patterns.', 'CLOTHING', 39.99),
(27, 'PROD027', 'Baseball Cap', 'Trendy baseball cap with adjustable strap.', 'CLOTHING', 14.99),
(28, 'PROD028', 'Rain Jacket', 'Waterproof rain jacket with a hood.', 'CLOTHING', 99.99),
(29, 'PROD029', 'Running Shorts', 'Breathable running shorts for workouts.', 'CLOTHING', 24.99),
(30, 'PROD030', 'Formal Shirt', 'Classic formal shirt for business attire.', 'CLOTHING', 39.99);