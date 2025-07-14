class DatabaseConnection {
  static connection;
  static {
    if (process.env.NODE_ENV === "production") {
      this.connection = this.loadProductionConnection();
    } else {
      this.connection = this.loadDevelopmentConnection();
    }
  }

  static loadProductionConnection() {
    return "Production Database Connection";
  }
  static loadDevelopmentConnection() {
    return "Development Database Connection";
  }
}


console.log(DatabaseConnection.connection);