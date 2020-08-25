/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapop;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniel González González - GISI
 */
public class JavaPoP {

    public static ArrayList<Producto> Productos = new ArrayList();
    public static ArrayList<Cliente> Usuarios = new ArrayList();
    public static ArrayList<Venta> Ventas = new ArrayList();
    public static Producto[] Producto;
    public static Cliente[] Usuario;
    public static String cod_postal = null;
    public static String nombreUsuario = null;
    public static String DNIUsuario = null;

    public static String RutaUsuarios = "./Ficheros/Usuarios.txt";
    public static String RutaProductos = "./Ficheros/Productos.txt";
    public static String RutaVentas = "./Ficheros/Ventas.txt";

    public static void main(String[] args) throws ParseException {

        Scanner entrada = new Scanner(System.in);
        datosPersonales(entrada);

        //Usuarios: Cliente y ClienteProfesional
        Usuarios.add(new Cliente("54743932E", "Jusep", "jusep@gmail.com", "jusepass", "17070", "Girona", "4265241745487134","145"));
        Usuarios.add(new ClienteProfesional("Tienda de Federico", "De 17:00 a 21:00", "918869420", "www.federico.com", "66597343S", "Federico", "federico@gmail.com", "federicopass", "28880", "Meco", "4862755964555294","763"));
        Usuarios.add(new Cliente("11838781Z", "Pedro", "pedro@gmail.com", "pedropass", "02070", "Albacete", "4341461819911672","910"));
        Usuarios.add(new Cliente("82800809G", "Javier", "javier@gmail.com", "javierpass", "28880", "Meco", "4653262157847987", "782"));
        Usuarios.add(new ClienteProfesional("Tienda de Jose", "De 16:00 a 19:00", "679552952", "www.jose.com", "32579426H", "Jose", "jose@gmail.com", "josepass", "19070", "Guadalajara", "4927951154636068","562"));
        Usuarios.add(new Cliente("24044276F", "Alejandro", "alejandro@gmail.com", "alejandropass", "28880", "Meco", "4327667333865776","123"));

        //Productos en la tienda
        Productos.add(new Producto("Collar de perlas", "Collar de mi tía Manoli", "Moda y accesorios", "Como nuevo", 35, "10/5/2010", "Sevilla", Usuarios.get(0))); //La fecha se guarda como String pero se puede convertir a Date llamando al método Date()
        Productos.add(new Producto("Raqueta de tenis", "Raqueta del mismísimo Rafa Nadal", "Deporte y ocio", "Bueno", 300, "21/12/2020", "Salamanca", Usuarios.get(0)));
        Productos.add(new Producto("Consola de juegos", "Nintendo Wii U para los más peques de la casa", "Consolas y videojuegos", "Aceptable", 60, "20/11/2005", "Murcia", Usuarios.get(0)));
        Productos.add(new Producto("Consola", "Play Station 3", "Consolas y videojuegos", "Bueno", 99.99, "9/5/2007", "Madrid", Usuarios.get(1), true));//Urgente activado
        Productos.add(new Producto("Televisión", "TV de plasma de 40 pulgadas", "TV, audio y foto", "Como nuevo", 245.99, "20/10/2000", "Valencia", Usuarios.get(1)));
        Productos.add(new Producto("Consola de videojuegos", "Play Station 4", "Consolas y videojuegos", "Regular", 40, "20/11/2005", "Madrid", Usuarios.get(2)));
        Productos.add(new Producto("Consola para la familia", "Nintendo Wii (mando no incluido)", "Consolas y videojuegos", "Bueno", 100.2, "9/5/2007", "Albacete", Usuarios.get(2), true));//Urgente activado
        Productos.add(new Producto("Accesorio consola", "Accesorios para la Wii", "Consolas y videojuegos", "Regular", 20.3, "20/11/2005", "Madrid", Usuarios.get(3)));
        Productos.add(new Producto("Consola Nintendo", "Nintendo 3DS", "Consolas y videojuegos", "Bueno", 120.60, "9/5/2007", "Vizcaya", Usuarios.get(3), true));//Urgente activado
        Productos.add(new Producto("Consola segundamano", "Play Station 4 para jugar", "Consolas y videojuegos", "Regular", 40, "20/11/2005", "Madrid", Usuarios.get(4)));
        Productos.add(new Producto("Informática teclado ordenador", "Teclado mecánico con luces", "Informática y Electrónica", "Bueno", 70.5, "9/5/2007", "Murcia", Usuarios.get(5), true));//Urgente activado
        Productos.add(new Producto("Teléfono móvil", "Samsung galaxy A40 con protector (a parte)", "Móviles y telefonía", "Regular", 45, "20/11/2005", "Madrid", Usuarios.get(3)));
        Productos.add(new Producto("Cámara de fotos", "Cámara réflex para hacer fotos y subirlas a Instagram", "TV, audio y foto", "Nuevo", 339.15, "9/5/2007", "Córdoba", Usuarios.get(5), true));//Urgente activado

        System.out.println("");

        /**
         * public Producto producto; public String fechaVenta; public String
         * DNIComprador; public String DNIVendedor; public String
         * nombreComprador; public String nombreVendedor;
         */
        Ventas.add(new Venta(Productos.get(1), "24/01/2020", "12345678O", Productos.get(1).propietario.DNI, "Daniel", Productos.get(1).propietario.nombre));
        Ventas.add(new Venta(Productos.get(2), "30/01/2020", "12345678Z", Productos.get(2).propietario.DNI, "Samuel", Productos.get(2).propietario.nombre));
        Ventas.add(new Venta(Productos.get(7), "28/12/2019", "12345678P", Productos.get(7).propietario.DNI, "Victoria", Productos.get(7).propietario.nombre));
        Ventas.add(new Venta(Productos.get(4), "28/04/2020", "12345678O", Productos.get(4).propietario.DNI, "Daniel", Productos.get(4).propietario.nombre));

        //Administrador
        Administrador admin = new Administrador("admin@javapop.com", "admin"); //No se usa para nada, de momento, pero está creado
        try {
            int i = 0;
            //Menú de la app JavaPoP
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(RutaUsuarios));
            while (i < Usuarios.size()) {
                oos.writeObject(Usuarios.get(i));
                i++;
            }
        } catch (IOException ex) {
            Logger.getLogger(JavaPoP.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            int i = 0;
            //Menú de la app JavaPoP
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(RutaProductos));
            while (i < Productos.size()) {
                oos.writeObject(Productos.get(i));
                i++;
            }
        } catch (IOException ex) {
            Logger.getLogger(JavaPoP.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            int i = 0;
            //Menú de la app JavaPoP
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(RutaVentas));
            while (i < Ventas.size()) {
                oos.writeObject(Ventas.get(i));
                i++;
            }
        } catch (IOException ex) {
            Logger.getLogger(JavaPoP.class.getName()).log(Level.SEVERE, null, ex);
        }

        String entradaUser = null;
        while (entradaUser != "Salir") {
            System.out.println();
            ImprimeMenu();
            System.out.print("\nRespuesta: ");
            entradaUser = entrada.nextLine();
            switch (entradaUser) {
                case "1":
                    System.out.println("Estos son los productos de los que disponemos actualmente:\n");
                    imprimeBusqueda(Productos);
                    break;
                case "2":
                    System.out.println("Estos son los usuarios que se encuentran registrados actualmente:\n");
                    imprimeUsuarios(Usuarios);
                    break;
                case "3":
                    System.out.println("Bienvenido a nuestro apartado de venta.\n");
                    System.out.println("Seleccione una de nuestras categorias:\n");
                    imprimeCategorias();
                    System.out.println();
                    System.out.print("Respuesta: ");
                    String Respuesta = entrada.nextLine();
                    String categoriaSeleccionada = null;
                    switch (Respuesta) {
                        case "1":
                            categoriaSeleccionada = "Moda y accesorios";
                            break;
                        case "2":
                            categoriaSeleccionada = "TV, audio y foto";
                            break;
                        case "3":
                            categoriaSeleccionada = "Móviles y telefonía";
                            break;
                        case "4":
                            categoriaSeleccionada = "Informática y electrónica";
                            break;
                        case "5":
                            categoriaSeleccionada = "Consolas y videojuegos";
                            break;
                        case "6":
                            categoriaSeleccionada = "Deporte y ocio";
                            break;
                    }
                    System.out.print("\nPorfavor intruzca una palabra clave: ");
                    String palabrasClave = entrada.nextLine();
                    if (palabrasClave.equals("")) {
                        palabrasClave = "-";
                    }
                    System.out.println("Estos son nuestros productos disponibles según su búsqueda:\n");
                    ArrayList<Producto> busqueda = busqueda(categoriaSeleccionada, palabrasClave);
                    imprimeBusqueda(busqueda);

                    System.out.println("¿Desea comprar algun producto?");
                    String confirmacion = entrada.nextLine();
                    switch (confirmacion.toUpperCase()) {
                        case "SI":
                            System.out.println("Seleccione un producto de nuestra lista:");
                            String respuestaCompra = entrada.nextLine();
                            if (isNumeric(respuestaCompra)) {
                                int numeroRespuesta = Integer.parseInt(respuestaCompra) - 1;
                                if (numeroRespuesta < busqueda.size() && numeroRespuesta > -1) {
                                    Producto productoComprado = busqueda.get(numeroRespuesta);
                                    generarTicket(productoComprado);
                                    //Ventas.add(productoComprado);
                                    Productos.remove(productoComprado);
                                    System.out.println("Venta realizada con éxito");
                                } else {
                                    System.out.println("El numero ha de ser entre 1 y el maximo de productos disponibles");
                                }
                            } else {
                                System.out.println("Introduzca un numero valido porfavor");
                            }
                            break;
                        case "NO":
                            break;
                        default:
                            System.out.println("Nuestro sistema solo tiene dos respuestas posibles 'SI' o 'NO'");
                            break;
                    }

                    break;
                case "4":
                    entradaUser = "Salir";
                    System.out.println("\nGracias por usar JavaPoP, vuelva pronto\n");
                    System.out.println("Compruebe su cambio antes de salir.\n"
                            + "La tienda no se hará responsable de cualquier uso fraudulento de la aplicación");
                    break;
                default:
                    System.out.println("Intruduza un menú valido");
                    entradaUser = null;
                    break;

            }

        }
    }

    /**
     * Método que imprime las opciones del menú
     */
    private static void ImprimeMenu() {
        System.out.println("Seleccione una opción:\n");
        System.out.println("1. Consulta de Productos");
        System.out.println("2. Consulta de Usuarios");
        System.out.println("3. Comprar un Producto");
        System.out.println("4. Salir");
    }

    /**
     * Método para pasar de fecha String a fecha Date
     *
     * @param fecha
     * @return
     * @throws ParseException
     */
    private static Date Date(String fecha) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date date = format.parse(fecha);

        return date;
    }

    /**
     * Método para buscar productos
     *
     * @param categoria
     * @param palabra_clave
     * @param cod_postal
     * @return
     */
    private static ArrayList busqueda(String categoria, String palabra_clave) {

        //Declaracion de variables
        ArrayList<Producto> ordenados = new ArrayList();
        ArrayList<Producto> categoria_ord = new ArrayList();

        //Cuerpo de funcion
        for (int i = 0; i < Productos.size(); i++) { //Bucle for para recorrer el array de productos
            if (Productos.get(i).categoria == categoria) { //Comprobamos si la categoría del producto del array coincide con la que busca el usuario
                if (palabra_clave != "-" && Productos.get(i).nombre.contains(palabra_clave)) { //Comprobamos también si la palabra clave del producto coincide con la que busca el usuario
                    categoria_ord.add(Productos.get(i)); //Añadimos los productos que coinciden con la categoría/clave
                } else if (palabra_clave == "-") {
                    categoria_ord.add(Productos.get(i)); //Añadimos los productos que coinciden con la categoría (clave no introducida)
                }
            }
        }
        ordenados = ordenar(categoria_ord);
        return ordenados;
    }

    /**
     * Método para ordenar los productos buscados por proximidad y urgencia
     *
     * @param categoria_ord
     * @return
     */
    private static ArrayList ordenar(ArrayList<Producto> categoria_ord) {
        ArrayList<Producto> ordenados = new ArrayList();
        ArrayList<Producto> ordenados0 = new ArrayList();
        ArrayList<Producto> ordenados1 = new ArrayList();
        ArrayList<Producto> ordenados2 = new ArrayList();
        ArrayList<Producto> ordenados3 = new ArrayList();
        ArrayList<Producto> ordenados4 = new ArrayList();
        ArrayList<Producto> ordenados5 = new ArrayList();

        //int contadorInterno = 1;
        while (!categoria_ord.isEmpty()) {
            Producto producto = categoria_ord.get(0);
            //System.out.println("While Proximidad: " + producto.getProximidad());

            switch (producto.proximidad) {
                case 0:
                    //System.out.println("Entro en proximidad 0");
                    ordenados0.add(producto);
                    categoria_ord.remove(0);
                    break;
                case 1:
                    //System.out.println("Entro en proximidad 1");
                    ordenados1.add(producto);
                    categoria_ord.remove(0);
                    break;
                case 2:
                    //System.out.println("Entro en proximidad 2");
                    ordenados2.add(producto);
                    categoria_ord.remove(0);
                    break;
                case 3:
                    //System.out.println("Entro en proximidad 3");
                    ordenados3.add(producto);
                    categoria_ord.remove(0);
                    break;
                case 4:
                    //System.out.println("Entro en proximidad 4");
                    ordenados4.add(producto);
                    categoria_ord.remove(0);
                    break;
                case 5:
                    //System.out.println("Entro en proximidad 5");
                    ordenados5.add(producto);
                    categoria_ord.remove(0);
                    break;
                default:
                    categoria_ord.remove(0);
                    break;
            }
        }
        int aux0 = 0;
        while (ordenados0.size() > aux0) {
            Producto productoAOrdenar = ordenados0.get(aux0);
            if (productoAOrdenar.isUrgente()) {
                ordenados0.remove(aux0);
                ordenados0.add(0, productoAOrdenar);
            }
            aux0++;
        }
        int aux1 = 0;
        while (ordenados1.size() > aux1) {
            Producto productoAOrdenar = ordenados1.get(aux1);
            if (productoAOrdenar.isUrgente()) {
                ordenados1.remove(aux1);
                ordenados1.add(0, productoAOrdenar);
            }
            aux1++;
        }
        int aux2 = 0;
        while (ordenados2.size() > aux2) {
            Producto productoAOrdenar = ordenados2.get(aux2);
            if (productoAOrdenar.isUrgente()) {
                ordenados2.remove(aux2);
                ordenados2.add(0, productoAOrdenar);
            }
            aux2++;
        }
        int aux3 = 0;
        while (ordenados3.size() > aux3) {
            Producto productoAOrdenar = ordenados3.get(aux3);
            if (productoAOrdenar.isUrgente()) {
                ordenados3.remove(aux3);
                ordenados3.add(0, productoAOrdenar);
            }
            aux3++;
        }
        int aux4 = 0;
        while (ordenados4.size() > aux4) {
            Producto productoAOrdenar = ordenados4.get(aux4);
            if (productoAOrdenar.isUrgente()) {
                ordenados4.remove(aux4);
                ordenados4.add(0, productoAOrdenar);
            }
            aux4++;
        }
        int aux5 = 0;
        while (ordenados5.size() > aux5) {
            Producto productoAOrdenar = ordenados5.get(aux5);
            if (productoAOrdenar.isUrgente()) {
                ordenados5.remove(aux5);
                ordenados5.add(0, productoAOrdenar);
            }
            aux5++;
        }

        ordenados.addAll(ordenados0);
        ordenados.addAll(ordenados1);
        ordenados.addAll(ordenados2);
        ordenados.addAll(ordenados3);
        ordenados.addAll(ordenados4);
        ordenados.addAll(ordenados5);

        //imprimeBusqueda(ordenados);
        return ordenados;
    }

    /**
     * Método para imprimir por pantalla la búsqueda realizada
     *
     * @param lista
     */
    private static void imprimeBusqueda(ArrayList<Producto> lista) {
        int numeroProducto = 1;
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(numeroProducto + ". ");
            System.out.println(lista.get(i));
            numeroProducto++;
        }
        System.out.println("\n");
    }

    /**
     * Método que imprime los Usuarios
     *
     * @param lista
     */
    private static void imprimeUsuarios(ArrayList<Cliente> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));

        }
        System.out.println("\n");
    }

    /**
     * Método que imprime arrasy por pantalla
     *
     * @param lista
     */
    private static void imprimeArray(Object[] lista) {
        for (Object lista1 : lista) {
            System.out.println(lista1);
        }
    }

    /**
     * Método que imprime por pantalla las categorías de los productos
     */
    private static void imprimeCategorias() {
        System.out.println("1. Moda y accesorios");
        System.out.println("2. TV, audio y foto");
        System.out.println("3. Móviles y telefonía");
        System.out.println("4. Informática y electrónica");
        System.out.println("5. Consolas y videojuegos");
        System.out.println("6. Deporte y ocio");
    }

    /**
     * Método para comprobar si lo que recibe es un número
     *
     * @param cadena
     * @return
     */
    public static boolean isNumeric(String cadena) {

        boolean resultado;

        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }

        return resultado;
    }

    /**
     * Método que genera y guarda el ticket de la compra realizada
     *
     * @param productoComprado
     */
    private static void generarTicket(Producto productoComprado) {

        try {
            String ruta = "D:\\Mis documentos\\GitHub\\JavaPop_Dani\\Productos Vendidos\\Venta_" + nombreUsuario + ".txt"; //Hay que cambiar la ruta para que pueda guardar el archivo
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Nombre producto: " + productoComprado.nombre + "\n");
            bw.write("Descripción: " + productoComprado.descripcion + "\n");
            bw.write("Categoria: " + productoComprado.categoria + "\n");
            bw.write("Estado: " + productoComprado.condicion + "\n");
            bw.write("Precio: " + productoComprado.precio + "\n");
            bw.write("Fecha Publicación: " + productoComprado.fecha + "\n");
            bw.write("Ubicación: " + productoComprado.propietario.ciudad + "\n");
            bw.write("Fecha: " + LocalDate.now() + "\n");
            bw.write("Nombre Vendedor: " + productoComprado.propietario.nombre + "\n");
            bw.write("DNI Vendedor: " + productoComprado.propietario.DNI + "\n");
            bw.write("Nombre Comprador: " + nombreUsuario + "\n");
            bw.write("DNI Comprador: " + DNIUsuario + "\n");
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Método para la entrada de datos del comprador (construido para probar el
     * programa)
     *
     * @param entrada
     */
    private static void datosPersonales(Scanner entrada) {

        System.out.println("¿Como te llamas?\n");
        System.out.print("Respuesta: ");
        nombreUsuario = entrada.nextLine();
        System.out.println("¿Cuál es tu DNI?\n");
        System.out.print("Respuesta: ");
        DNIUsuario = entrada.nextLine();
        System.out.println("¿Cuál es tu código postal?\n");
        System.out.print("Respuesta: ");
        cod_postal = entrada.nextLine();
        System.out.println("Gracias por sus respuestas, ya tiene acceso a la aplicación:");
    }

}
