Feature: Weather API Tests

  Background:
    * url baseUrl
    * def apiKey = 'your_api_key_here'

  Scenario: Obtener el clima por nombre de ciudad
    Given path 'weather'
    And param q = 'London'
    And param appid = apiKey
    When method GET
    Then status 200
    And match response.name == 'London'

  Scenario: Obtener el clima por latitud y longitud
    Given path 'weather'
    And param lat = '35'
    And param lon = '139'
    And param appid = apiKey
    When method GET
    Then status 200
    And match response.coord.lat == 35

  Scenario: Obtener el clima en formato JSON
    Given path 'weather'
    And param q = 'London'
    And param appid = apiKey
    And param mode = 'json'
    When method GET
    Then status 200
    And match response.name == 'London'

  Scenario: Obtener el clima en formato XML
    Given path 'weather'
    And param q = 'London'
    And param appid = apiKey
    And param mode = 'xml'
    When method GET
    Then status 200

