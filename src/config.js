/**
 * Application configuration loaded from environment variables.
 * @type {Object}
 * @property {string} apiKey - API authentication key from API_KEY env var
 * @property {string} password - API password from API_PASSWORD env var
 */
const config = {
  apiKey: process.env.API_KEY,
  password: process.env.API_PASSWORD
};

// Trim values to handle accidental whitespace
config.apiKey = config.apiKey?.trim();
config.password = config.password?.trim();

// Validate required environment variables
if (!config.apiKey || !config.password) {
  const missing = [];
  if (!config.apiKey) missing.push('API_KEY');
  if (!config.password) missing.push('API_PASSWORD');
  throw new Error(`Missing required environment variables: ${missing.join(', ')}`);
}

module.exports = config;
