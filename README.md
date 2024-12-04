# API REST de Productos con Login y Registro de Usuarios

Aplicación que permite a los usuarios registrarse e iniciar sesión para acceder a la funcionalidad de gestión de productos.

## Características Principales

**CRUD de Productos:**
- **Crear:** Agregar nuevos productos a la base de datos.
- **Leer:** Consultar la lista de productos o un producto específico.
- **Actualizar:** Modificar información existente de un producto.
- **Eliminar:** Borrar productos de la base de datos.

**Seguridad con spring security:**

La aplciacion permite a los usuarios registrarse e iniciar sesion y segun el rol del usuario podra acceder
a las diferentes funcionalidades del CRUD de productos, si es admin podra agregar, ver, editar o borrar los productos mientras que los usuarios normales,
solamente pueden ver los productos.

**Validaciones:**

La aplicacion permite validar los campos de los datos ingresados para validar: tipos de dato, valores nulos, valores no validos,
campos vacios etc...

