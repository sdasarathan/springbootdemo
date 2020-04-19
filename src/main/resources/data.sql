--Starting DB script
CREATE TABLE person (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL
);

-- Tables for Portfolio
DROP TABLE IF EXISTS portfolio;
DROP TABLE IF EXISTS investor;
DROP TABLE IF EXISTS fund;
CREATE TABLE portfolio (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  username VARCHAR(250) NOT NULL
);
CREATE TABLE investor (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL
);
CREATE TABLE fund (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  investor_id INT,
  fund_name VARCHAR(250) NOT NULL,
  fund_type VARCHAR(250) NOT NULL,
  FOREIGN KEY (investor_id) REFERENCES investor(id)
);

INSERT INTO investor (first_name, last_name) values ('John', 'Wick');
INSERT INTO fund (investor_id, fund_name, fund_type) VALUES ('1', 'SBI-Smart Scholor', 'MUTUAL FUND');
INSERT INTO portfolio (username) VALUES ('Test Portfolio');
-- Ending DB script