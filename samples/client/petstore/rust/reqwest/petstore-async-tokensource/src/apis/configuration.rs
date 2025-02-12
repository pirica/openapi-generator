/*
 * OpenAPI Petstore
 *
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 * Generated by: https://openapi-generator.tech
 */


use std::sync::Arc;
use google_cloud_token::TokenSource;
use async_trait::async_trait;

#[derive(Debug, Clone)]
pub struct Configuration {
    pub base_path: String,
    pub user_agent: Option<String>,
    pub client: reqwest::Client,
    pub token_source: Arc<dyn TokenSource>,
}


impl Configuration {
    pub fn new() -> Configuration {
        Configuration::default()
    }
}

impl Default for Configuration {
    fn default() -> Self {
        Configuration {
            base_path: "http://petstore.swagger.io/v2".to_owned(),
            user_agent: Some("OpenAPI-Generator/1.0.0/rust".to_owned()),
            client: reqwest::Client::new(),
            token_source: Arc::new(NoopTokenSource{}),
        }
    }
}
#[derive(Debug)]
struct NoopTokenSource{}

#[async_trait]
impl TokenSource for NoopTokenSource {
    async fn token(&self) -> Result<String, Box<dyn std::error::Error + Send + Sync>> {
        panic!("This is dummy token source. You can use TokenSourceProvider from 'google_cloud_auth' crate, or any other compatible crate.")
    }
}
