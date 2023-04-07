Feature: Yo como usuario de Saucedemo
  quiero entrar a la website de esta empresa y comprar dos articulos verificando que el proceso haya sido exitoso
  para verificar el flujo e2e de una compra

  Scenario: Compra exitosa de dos productos en la website de Saucedemo
    Given que el usuario se encuentra en la pagina principal de Saucedemo
    When el usuario inicia sesion y agrega dos productos al carrito hace clic en el icono del carrito completa el formulario de compra con los detalles requeridos y hace clic en el boton FINALIZAR
      | username      | password     |
      | standard_user | secret_sauce |
    Then el usuario deberia ver el mensaje de confirmacion "Thank you for your order!"