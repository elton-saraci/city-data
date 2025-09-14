# City Tree App

This project demonstrates how to build a hierarchical tree structure of world cities, countries, and continents in Java.
The tree has a root node **"World"**, with continents as children, followed by countries, and finally cities.

Example:

```
World
  Europe
    Germany
      Berlin
      Freiburg
    France
      Paris
      Lyon
  Asia
    Japan
      Tokyo
      Osaka
    China
      Beijing
  North America
    USA
      New York
      Los Angeles
    Canada
      Toronto
```

---

## Features

* Reads a dataset of cities, countries, and continents (10 sample entries included).
* Builds a **tree structure** with a root node `"World"`.
* Logs progress while adding nodes.
* Ensures **data consistency**:

    * A city cannot belong to two different countries.
    * A country cannot belong to two different continents.
* Prints the final tree structure to the console.

---

## Project Structure

* `TreeNode` → Represents a node in the tree.
* `CityData` → Holds one dataset entry (city, country, continent).
* `CityTreeManager` → Handles validation, building the tree, and logging.
* `Main` → Main class with example dataset and tree printing.

---

## How to Run

1. Clone or download this repository.
2. Run the Main.java file
3. The program will log progress to the console and then print the full tree.

---

## Example Output

```
Added Freiburg (Germany, Europe)
Added Berlin (Germany, Europe)
Added Paris (France, Europe)
Added Lyon (France, Europe)
Added Tokyo (Japan, Asia)
Added Osaka (Japan, Asia)
Added Beijing (China, Asia)
Added New York (USA, North America)
Added Los Angeles (USA, North America)
Added Toronto (Canada, North America)

World
  Europe
    Germany
      Freiburg
      Berlin
    France
      Paris
      Lyon
  Asia
    Japan
      Tokyo
      Osaka
    China
      Beijing
  North America
    USA
      New York
      Los Angeles
    Canada
      Toronto
```

---

## Discussion Points

* **Improvements:** Split logic further (validation, data source, logging).
* **Interfaces:** Could be used for `DataSource` (file, DB, API) and `TreePrinter`.
* **Performance:** Works fine for small datasets; large datasets (10M rows) may require database-backed storage or streaming.
* **Thread Safety:** Currently not thread-safe; could use `ConcurrentHashMap`, synchronization, or immutability for multi-threaded use.

---
