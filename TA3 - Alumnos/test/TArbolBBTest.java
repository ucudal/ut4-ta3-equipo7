/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TArbolBBTest {
    
    public TArbolBBTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of insertar method, of class TArbolBB.
     */
    @Test
    public void testInsertar() {
        System.out.println("insertar");
        TArbolBB instance = new TArbolBB();
        boolean expResult = false;
        boolean result = instance.insertar(null);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscar method, of class TArbolBB.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        Comparable unaEtiqueta = null;
        TArbolBB instance = new TArbolBB();
        TElementoAB expResult = null;
        TElementoAB result = instance.buscar(unaEtiqueta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inOrden method, of class TArbolBB.
     */
    @Test
    public void testInOrden() {
        System.out.println("inOrden");
        TArbolBB instance = new TArbolBB();
        String expResult = "";
        String result = instance.inOrden();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of esVacio method, of class TArbolBB.
     */
    @Test
    public void testEsVacio() {
        System.out.println("esVacio");
        TArbolBB instance = new TArbolBB();
        boolean expResult = false;
        boolean result = instance.esVacio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of vaciar method, of class TArbolBB.
     */
    @Test
    public void testVaciar() {
        System.out.println("vaciar");
        TArbolBB instance = new TArbolBB();
        boolean expResult = false;
        boolean result = instance.vaciar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inorden method, of class TArbolBB.
     */
    @Test
    public void testInorden() {
        System.out.println("inorden");
        TArbolBB instance = new TArbolBB();
        Lista expResult = null;
        Lista result = instance.inorden();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerAltura method, of class TArbolBB.
     */
    @Test
    public void testObtenerAltura() {
        System.out.println("obtenerAltura");
        TArbolBB instance = new TArbolBB();
        int expResult = 0;
        int result = instance.obtenerAltura();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    /**
     * Test of obtenerTamanio method, of class TElementoAB.
     */
    @Test
    public void testObtenerTamanioVacio() {
        TArbolBB<Integer> a = new TArbolBB<>();
        assertEquals(a.obtenerTamanio(), 0);
    }

    @Test
    public void testObtenerTamanioUnElem() {
        TArbolBB<Integer> a = new TArbolBB<>();
        TElementoAB<Integer> n = new TElementoAB<>("A", 1);

        a.insertar(n);

        assertEquals(a.obtenerTamanio(), 1);
        assertEquals(a.buscar("A"), n);
    }

    @Test
    public void testObtenerTamanio() {
        TArbolBB<Integer> a = new TArbolBB<>();

        TElementoAB<Integer> raiz = new TElementoAB<>("D", 4);

        a.insertar(raiz);
        a.insertar(new TElementoAB<>("A", 1));
        a.insertar(new TElementoAB<>("C", 3));
        a.insertar(new TElementoAB<>("F", 6));
        a.insertar(new TElementoAB<>("E", 5));
        a.insertar(new TElementoAB<>("B", 2));

        String preOrden = a.preOrden();
        String inOrden = a.inOrden();

        assertEquals(a.obtenerTamanio(), 6);
        assertEquals(a.preOrden(), preOrden);
        assertEquals(a.inOrden(), inOrden);
        assertEquals(a.obtenerTamanio(), 1 + raiz.getHijoIzq().obtenerTamanio() + raiz.getHijoDer().obtenerTamanio());
    }


    /**
     * Test of obtenerNivel method, of class TArbolBB.
     */
    @Test
    public void testObtenerNivel() {
        System.out.println("obtenerNivel");
        Comparable unaEtiqueta = null;
        TArbolBB instance = new TArbolBB();
        int expResult = 0;
        int result = instance.obtenerNivel(unaEtiqueta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerCantidadHojas method, of class TArbolBB.
     */
    @Test
    public void testObtenerCantidadHojas() {
        System.out.println("obtenerCantidadHojas");
        TArbolBB instance = new TArbolBB();
        int expResult = 0;
        int result = instance.obtenerCantidadHojas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testObtenerAlturaArbolVacio(){
        System.out.println("obtenerAlturaArbolVacio");
        TArbolBB instance = new TArbolBB();
        int expResult = -1;
        int result = instance.obtenerAltura();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testObtenerAlturaArbol1Nodo(){
        System.out.println("obtenerAlturaArbol1Nodo");
        TArbolBB instance = new TArbolBB();
        TElementoAB unElemento = new TElementoAB("Hola", 1); 
        instance.insertar(unElemento);
        int expResult = 0;
        int result = instance.obtenerAltura();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testObtenerAlturaArbol2Nodo2(){
        System.out.println("obtenerAlturaArbol2Nodos");
        TArbolBB instance = new TArbolBB();
        TElementoAB unElemento = new TElementoAB("Hola", 1); 
        TElementoAB unElemento2 = new TElementoAB("Hola2", 2); 
        instance.insertar(unElemento);
        instance.insertar(unElemento2);
        int expResult = 1;
        int result = instance.obtenerAltura();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testObtenerAlturaArbolInmutabilidad(){
        System.out.println("obtenerAlturaArbolInmutabilidad");
        TArbolBB instance = new TArbolBB();
        TElementoAB unElemento = new TElementoAB("Hola", 1); 
        TElementoAB unElemento2 = new TElementoAB("Hola2", 2); 
        instance.insertar(unElemento);
        instance.insertar(unElemento2);
        
        
        TArbolBB instanceCopy = new TArbolBB();
        TElementoAB unElementoCopy = new TElementoAB("Hola", 1); 
        TElementoAB unElemento2Copy = new TElementoAB("Hola2", 2); 
        instance.insertar(unElementoCopy);
        instance.insertar(unElemento2Copy);
        
        
        
        instance.obtenerAltura();
        String expResult = instanceCopy.preOrden();
        String result = instance.preOrden();
        assertEquals(expResult, result);
    }
    
    
}
