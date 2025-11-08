/*
 * Ad Soyad: [ismail ÖZDEMİR]
 * Ogrenci No: [250541109]
 * Tarih: [8.11.2025]
 * Aciklama: Gorev 1 - Geometrik Sekil Hesaplayici
 * 
 * Bu program temel geometrik sekillerin alan ve
 * cevre hesaplamalarini yapar.
 */

import java.util.Scanner;

public class GeometriHesap {
    
    // METOT 1: Kare alani
    public static double calculateSquareArea(double side) {
        // Alan = kenar * kenar
        
        return 0.0; // Degistirin
    }
    
    // METOT 2: Kare cevresi
    public static double calculateSquarePerimeter(double side) {
        // Cevre = 4 * kenar
        
        return 0.0; // Degistirin
    }
    
    // METOT 3: Dikdortgen alani
    public static double calculateRectangleArea(double width, double height) {
        // Alan = genislik * yukseklik
        
        return 0.0; // Degistirin
    }
    
    // METOT 4: Dikdortgen cevresi
    public static double calculateRectanglePerimeter(double width, double height) {
        // Cevre = 2 * (genislik + yukseklik)
        
        return 0.0; // Degistirin
    }
    
    // METOT 5: Daire alani
    public static double calculateCircleArea(double radius) {
        // Alan = PI * r * r
        // Math.PI kullanabilirsiniz
        
        return 0.0; // Degistirin
    }
    
    // METOT 6: Daire cevresi
    public static double calculateCircleCircumference(double radius) {
        // Cevre = 2 * PI * r
        
        return 0.0; // Degistirin
    }
    
    // METOT 7: Ucgen alani (taban ve yukseklik ile)
    public static double calculateTriangleArea(double base, double height) {
        // Alan = (taban * yukseklik) / 2
        
        return 0.0; // Degistirin
    }
    
    // METOT 8: Ucgen cevresi
    public static double calculateTrianglePerimeter(double a, double b, double c) {
        // Cevre = a + b + c
        
        return 0.0; // Degistirin
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== GEOMETRIK SEKIL HESAPLAYICI ===");
        System.out.println();
        
        // KARE bilgileri
        System.out.println("KARE:");
        System.out.print("Kenar uzunlugu (cm): ");
        double squareSide = input.nextDouble();
        
        // DIKDORTGEN bilgileri
        System.out.println("\nDIKDORTGEN:");
        System.out.print("Kisa kenar (cm): ");
        double rectWidth = input.nextDouble();
        System.out.print("Uzun kenar (cm): ");
        double rectHeight = input.nextDouble();
        
        // DAIRE bilgileri
        System.out.println("\nDAIRE:");
        System.out.print("Yaricap (cm): ");
        double radius = input.nextDouble();
        
        // UCGEN bilgileri
        System.out.println("\nUCGEN:");
        System.out.print("Taban (cm): ");
        double base = input.nextDouble();
        System.out.print("Yukseklik (cm): ");
        double height = input.nextDouble();
        System.out.print("1. kenar (cm): ");
        double side1 = input.nextDouble();
        System.out.print("2. kenar (cm): ");
        double side2 = input.nextDouble();
        System.out.print("3. kenar (cm): ");
        double side3 = input.nextDouble();
        
        // HESAPLAMALARI YAP - Metotlari cagir
        
        
        
        
        
        
        
        
        
        
        
        // SONUCLARI YAZDIR
        System.out.println("\n========================================");
        System.out.println("         HESAPLAMA SONUCLARI");
        System.out.println("========================================");
        
        System.out.printf("\nKARE (kenar: %.1f cm):\n", squareSide);
        // Alan ve cevre yazdir
        
        
        System.out.printf("\nDIKDORTGEN (%.1f x %.1f cm):\n", rectWidth, rectHeight);
        // Alan ve cevre yazdir
        
        
        System.out.printf("\nDAIRE (yaricap: %.1f cm):\n", radius);
        // Alan ve cevre yazdir
        
        
        System.out.printf("\nUCGEN (taban: %.1f, yukseklik: %.1f cm):\n", base, height);
        // Alan ve cevre yazdir
        
        
        System.out.println("========================================");
        
        input.close();
    }
}
ÖDEV JAVA KODU 

       import java.util.Scanner;

public class GeometriHesap {
    
    // METOT 1: Kare alanı
    public static double calculateSquareArea(double side) {
        // Alan = kenar * kenar
        return side * side;
    }
    
    // METOT 2: Kare çevresi
    public static double calculateSquarePerimeter(double side) {
        // Çevre = 4 * kenar
        return 4 * side;
    }
    
    // METOT 3: Dikdörtgen alanı
    public static double calculateRectangleArea(double width, double height) {
        // Alan = genişlik * yükseklik
        return width * height;
    }
    
    // METOT 4: Dikdörtgen çevresi
    public static double calculateRectanglePerimeter(double width, double height) {
        // Çevre = 2 * (genişlik + yükseklik)
        return 2 * (width + height);
    }
    
    // METOT 5: Daire alanı
    public static double calculateCircleArea(double radius) {
        // Alan = π * r²
        return Math.PI * radius * radius;
    }
    
    // METOT 6: Daire çevresi
    public static double calculateCircleCircumference(double radius) {
        // Çevre = 2 * π * r
        return 2 * Math.PI * radius;
    }
    
    // METOT 7: Üçgen alanı (taban ve yükseklik ile)
    public static double calculateTriangleArea(double base, double height) {
        // Alan = (taban * yükseklik) / 2
        return (base * height) / 2.0;
    }
    
    // METOT 8: Üçgen çevresi
    public static double calculateTrianglePerimeter(double a, double b, double c) {
        // Çevre = a + b + c
        return a + b + c;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== 📐 GEOMETRİK ŞEKİL HESAPLAYICI ===\n");
        
        // KARE bilgileri
        System.out.println("KARE:");
        System.out.print("Kenar uzunluğu (cm): ");
        double squareSide = input.nextDouble();
        
        // DİKDÖRTGEN bilgileri
        System.out.println("\nDİKDÖRTGEN:");
        System.out.print("Kısa kenar (cm): ");
        double rectWidth = input.nextDouble();
        System.out.print("Uzun kenar (cm): ");
        double rectHeight = input.nextDouble();
        
        // DAİRE bilgileri
        System.out.println("\nDAİRE:");
        System.out.print("Yarıçap (cm): ");
        double radius = input.nextDouble();
        
        // ÜÇGEN bilgileri
        System.out.println("\nÜÇGEN:");
        System.out.print("Taban (cm): ");
        double base = input.nextDouble();
        System.out.print("Yükseklik (cm): ");
        double height = input.nextDouble();
        System.out.print("1. kenar (cm): ");
        double side1 = input.nextDouble();
        System.out.print("2. kenar (cm): ");
        double side2 = input.nextDouble();
        System.out.print("3. kenar (cm): ");
        double side3 = input.nextDouble();
        
        // === HESAPLAMALAR ===
        double squareArea = calculateSquareArea(squareSide);
        double squarePerimeter = calculateSquarePerimeter(squareSide);
        
        double rectangleArea = calculateRectangleArea(rectWidth, rectHeight);
        double rectanglePerimeter = calculateRectanglePerimeter(rectWidth, rectHeight);
        
        double circleArea = calculateCircleArea(radius);
        double circleCircumference = calculateCircleCircumference(radius);
        
        double triangleArea = calculateTriangleArea(base, height);
        double trianglePerimeter = calculateTrianglePerimeter(side1, side2, side3);
        
        // === SONUÇLARI YAZDIR ===
        System.out.println("\n========================================");
        System.out.println("          📏 HESAPLAMA SONUÇLARI");
        System.out.println("========================================");
        
        System.out.printf("\nKARE (kenar: %.1f cm):\n", squareSide);
        System.out.printf("  Alan     : %.2f cm²\n", squareArea);
        System.out.printf("  Çevre    : %.2f cm\n", squarePerimeter);
        
        System.out.printf("\nDİKDÖRTGEN (%.1f x %.1f cm):\n", rectWidth, rectHeight);
        System.out.printf("  Alan     : %.2f cm²\n", rectangleArea);
        System.out.printf("  Çevre    : %.2f cm\n", rectanglePerimeter);
        
        System.out.printf("\nDAİRE (yarıçap: %.1f cm):\n", radius);
        System.out.printf("  Alan     : %.2f cm²\n", circleArea);
        System.out.printf("  Çevre    : %.2f cm\n", circleCircumference);
        
        System.out.printf("\nÜÇGEN (taban: %.1f cm, yükseklik: %.1f cm):\n", base, height);
        System.out.printf("  Alan     : %.2f cm²\n", triangleArea);
        System.out.printf("  Çevre    : %.2f cm\n", trianglePerimeter);
        
        System.out.println("========================================");
        
        input.close();
    }
}

    
