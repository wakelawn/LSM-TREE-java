## LSM-Tree Architecture

```text
                      Client
                        │
                put(key, value)
                  get(key)
                        │
                        ▼
               ┌─────────────────┐
               │    MemTable     │  ← in-memory SkipList
               └────────┬────────┘
                        │
                 WAL ───┤  ← durability
                        │
                  size threshold
                        │
                        ▼
               ┌─────────────────┐
               │    SSTable      │  ← immutable disk file
               └────────┬────────┘
                        │
                 background
                  compaction
                        │
                        ▼
               ┌─────────────────┐
               │   SSTable 2     │
               └─────────────────┘
```

## SkipList

### Why we use it

The MemTable needs an in-memory structure that maintains
keys in sorted order while providing efficient insertion
and lookup.

### Implementation

We implemented our own SkipList rather than using
ConcurrentSkipListMap so that the underlying data structure
could be understood and controlled directly.

### Complexity

Average:
- Search: O(log n)
- Insert: O(log n)

### What I learned

...