DROP TABLE IF EXISTS player;

CREATE TABLE player (
  id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(255) NOT NULL,
  title VARCHAR(255) NOT NULL,
  strength  INT UNSIGNED NOT NULL,
  intelligence  INT UNSIGNED NOT NULL,
  dexterity  INT UNSIGNED NOT NULL
);