# AUTOR
@AnemonaShin - Christian Ramirez

# BSALETEST STORE
Repositorio Creado para Almacenar Desarrollo de Prueba para BSALE.

# Informacion
Servicio Encargado de Obtener la informacion interna desde la BASE DE DATOS de BSALE para generar una API la cual será consumida desde un Cliente WEB, este cliente utilizará las siguientes funcionalidades:

- Obtener Categorias
- Obtener Productos
- Obtener Productos por Categorias

# Obtener Categorias
Metodo que obtiene las categorias informadas por la BASE DE DATOS.

Los campos de respuesta que posee son los siguientes:
- ID (ID DE CATEGORIA)
- NAME (NOMBRE DE CATEGORIA)

# Obtener Productos
Metodo que obtiene los productos informados por la BASE DE DATOS.

Los campos de respuesta que posee son los siguientes:
- ID (ID DEL PRODUCTO)
- NAME (NOMBRE DEL PRODUCTO)
- URL IMAGE (IMAGEN DEL PRODUCTO)
- PRICE (PRECIO DEL PRODUCTO)
- DISCOUNT (DESCUENTO DEL PRODUCTO)
- CATEGORY (CATEGORIA DEL PRODUCTO)

# Obtener Productos Por Categoria
Metodo que obtiene los productos por la categoria asignada, este requiere un campo de entrada llamado "CATEGORY_ID" el cual se encuentra directamente en la URL como "patch variable".

Los campos de respuesta que posee son los siguientes:
- ID (ID DEL PRODUCTO)
- NAME (NOMBRE DEL PRODUCTO)
- URL IMAGE (IMAGEN DEL PRODUCTO)
- PRICE (PRECIO DEL PRODUCTO)
- DISCOUNT (DESCUENTO DEL PRODUCTO)
- CATEGORY (CATEGORIA DEL PRODUCTO)