const config = {
  apiKey: process.env.API_KEY,
  password: process.env.API_PASSWORD
};

// Validate required environment variables
if (!config.apiKey || !config.password) {
  throw new Error('Missing required environment variables: API_KEY and API_PASSWORD');
}

module.exports = config;
