db.auth('admin-user', 'admin-password')

db = db.getSiblingDB('test-database')

db.createUser({
  user: 'test-user',
  pwd: 'test-password',
  roles: [
    {
      role: 'readWrite',
      db: 'test-database',
    },
  ],
});

db.test.insertMany([
{
    _id: 1,
    firstName: "Jesper",
    lastName: "Andersson",
    timestamp: "2021-03-13"
}
])