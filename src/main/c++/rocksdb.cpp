#include <cassert>
#include "rocksdb/db.h"

int main(int ac, char** av) {
  rocksdb::DB* db;
  rocksdb::Options options;
  options.create_if_missing = true;
  rocksdb::Status status = rocksdb::DB::Open(options, "/tmp/testdb", &db);
}
