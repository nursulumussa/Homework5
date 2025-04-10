# Homework5
Proxy and Flyweight Design Patterns Implementation in Java
Project Overview
This project demonstrates the implementation of two fundamental structural design patterns: Proxy and Flyweight. The goal is to apply these patterns to real-world scenarios where performance optimization and resource management are critical.

Proxy Pattern: In this scenario, a real estate agency needs to manage large property images. Low-resolution thumbnails are loaded immediately to improve performance, while high-resolution images are only loaded when the user requests them (via a zoom feature).

Flyweight Pattern: The project simulates a map application that displays numerous location markers (e.g., gas stations, restaurants, hospitals). Since these markers share common attributes (like icons, color, and label style), the Flyweight Pattern is used to minimize memory usage by sharing common styles across multiple markers.

Problem and Solution
Proxy Pattern
Problem:
Real estate agencies often deal with high-resolution images that are large in size. To optimize loading times, we want to load only thumbnails initially and fetch the high-resolution images only when the user decides to zoom into a property. This helps in reducing initial load time and bandwidth usage.

Solution:
Using the Proxy Pattern, we create a proxy class that serves as a stand-in for the real high-resolution image. The proxy initially displays a thumbnail and only loads the full image when required by the user.

Flyweight Pattern
Problem:
A map application displays thousands of markers (e.g., gas stations, restaurants, hospitals). Each marker has common styling information like icon type, color, and label style. Storing this information redundantly for each marker leads to unnecessary memory usage.

Solution:
We use the Flyweight Pattern to create shared objects for marker styles. These shared objects are reused across multiple markers, ensuring that the styling data is stored only once, thus reducing memory usage.
