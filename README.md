# LSM-Tree Key-Value Storage Engine (Java)

A learning-focused implementation of an LSM-Tree (Log-Structured Merge-Tree) key-value storage engine using Java. The project is being developed incrementally to understand data structures, storage internals, persistence, and concurrency.

## Project Status

🚧 In Development — Initial in-memory implementation.

## Technology Stack

- **Language:** Java 25 LTS
- **Build Tool:** Apache Maven
- **IDE:** Eclipse
- **Testing:** JUnit 5
- **Version Control:** Git and GitHub

## Project Overview

The goal is to build a key-value storage engine that supports efficient writes and lookups while progressively introducing persistent storage and background compaction.

The initial implementation uses a Java `HashMap`. This will later be replaced by an LSM-Tree architecture with a MemTable, Write-Ahead Log (WAL), Sorted-String Tables (SSTables), Bloom filters, and compaction.

## Implemented Features

- [x] Maven project setup
- [x] Java 25 project configuration
- [x] Basic key-value API
- [x] Insert and update values using `put(key, value)`
- [x] Retrieve values using `get(key)`
- [x] Delete entries using `delete(key)`
- [ ] Automated JUnit 5 tests — in progress
- [ ] Custom SkipList
- [ ] MemTable
- [ ] Write-Ahead Log (WAL)
- [ ] SSTable file storage
- [ ] Bloom Filter
- [ ] Compaction
- [ ] Concurrent access
- [ ] Crash recovery
- [ ] Performance benchmarking

## Current API

| Method | Behavior |
|---|---|
| `put(key, value)` | Inserts a key-value pair or replaces the existing value for that key. |
| `get(key)` | Returns the associated value, or `null` if the key is absent. |
| `delete(key)` | Removes the key and its associated value if present. |

## Current Implementation

The `LsmTree` class currently uses a `HashMap<String, String>` to store data in memory.

```java
private final Map<String, String> data = new HashMap<>();
```

### Current Limitations

- Data exists only in memory.
- Data is lost when the application terminates.
- The current implementation is not designed for concurrent access.
- No WAL, SSTables, Bloom filters, or compaction have been implemented yet.

## Planned Architecture

1. **MemTable:** Store recent writes in memory.
2. **SkipList:** Maintain MemTable entries in sorted key order.
3. **Write-Ahead Log:** Record writes for recovery after a crash.
4. **SSTables:** Flush sorted data to immutable disk files.
5. **Bloom Filter:** Reduce unnecessary SSTable lookups.
6. **Compaction:** Merge SSTables and discard obsolete entries safely.
7. **Concurrency:** Support safe access and background compaction.
8. **Crash Recovery:** Restore the latest valid state after restart.

## Learning Notes

This project is being developed step by step. Each component will be implemented, tested, and documented as the project progresses.

### Lessons Completed

- Java project and Maven structure
- Packages and classes
- `Map` and `HashMap`
- Encapsulation using `private`
- `final` references
- Key-value insertion, retrieval, updating, and deletion
- Method parameters and return types

### Next Milestone

Implement and test the key-value API using JUnit 5, then study and implement a custom SkipList.

## Build and Run

Compile the project:

```bash
mvn clean package
```

Run the application from Eclipse using `LsmTree.java` as a Java Application.

## License

Not yet selected.