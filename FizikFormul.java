/*
 * Ad Soyad: [İsmail ÖZDEMİR]
 * Ogrenci No: [250541109]
 * Tarih: [8.11.2025]
 * Aciklama: Gorev 2 - Fizik Formulu Asistani
 *
 * Bu program temel fizik formullerini kullanarak
 * hesaplamalar yapar.
 */

import java.util.Scanner;

public class FizikFormul {

    // Sabit: Yercekimi ivmesi
    final static double GRAVITY = 9.8; // m/s²

    // METOT 1: Hız hesapla (v = s / t)
    public static double calculateVelocity(double distance, double time) {
        // v = mesafe / zaman
        return 0.0; // Degistirin
    }

    // METOT 2: İvme hesapla (a = Δv / t)
    public static double calculateAcceleration(double velocityChange, double time) {
        // a = hiz degisimi / zaman
        return 0.0; // Degistirin
    }

    // METOT 3: Kuvvet hesapla (F = m * a)
    public static double calculateForce(double mass, double acceleration) {
        // F = kutle * ivme
        return 0.0; // Degistirin
    }

    // METOT 4: İş hesapla (W = F * d)
    public static double calculateWork(double force, double distance) {
        // W = kuvvet * mesafe
        return 0.0; // Degistirin
    }

    // METOT 5: Güç hesapla (P = W / t)
    public static double calculatePower(double work, double time) {
        // P = is / zaman
        return 0.0; // Degistirin
    }

    // METOT 6: Kinetik enerji (KE = 0.5 * m * v²)
    public static double calculateKineticEnergy(double mass, double velocity) {
        // KE = 0.5 * kutle * (hiz * hiz)
        // Math.pow(velocity, 2) kullanabilirsiniz
        return 0.0; // Degistirin
    }

    // METOT 7: Potansiyel enerji (PE = m * g * h)
    public static double calculatePotentialEnergy(double mass, double gravity, double height) {
        // PE = kutle * yercekimi * yukseklik
        return 0.0; // Degistirin
    }

    // METOT 8: Momentum (p = m * v)
    public static double calculateMomentum(double mass, double velocity) {
        // p = kutle * hiz
        return 0.0; // Degistirin
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== FIZIK FORMUL ASISTANI ===");
        System.out.println();

        // TEMEL OLCUMLER
        System.out.println("TEMEL OLCUMLER:");
        System.out.print("Kutle (kg): ");
        double mass = input.nextDouble();

        System.out.print("Mesafe (m): ");
        double distance = input.nextDouble();

        System.out.print("Zaman (s): ");
        double time = input.nextDouble();

        System.out.print("Hiz degisimi (m/s): ");
        double deltaV = input.nextDouble();

        System.out.print("Yukseklik (m): ");
        double height = input.nextDouble();

        // HESAPLAMALARI YAP - Metotlari cagir
        // 1. Hiz (v) hesaplanmali (KE ve Momentum icin gerekli)
        // 2. Ivme (a) hesaplanmali (Kuvvet icin gerekli)
        // 3. Kuvvet (F) hesaplanmali (Is icin gerekli)
        // 4. Is (W) hesaplanmali (Guc icin gerekli)
        // ... digerlerini hesaplayin
  


        // SONUCLARI YAZDIR
        System.out.println("\n========================================");
        System.out.println("        HESAPLAMA SONUCLARI");
        System.out.println("========================================");

        System.out.println("\nHIZ ve HAREKET:");
        System.out.printf("  Hiz (v = s/t)             : %.2f m/s\n", velocity);
        System.out.printf("  Ivme (a = Δv/t)           : %.2f m/s²\n", acceleration);

        System.out.println("\nKUVVET ve IS:");
        System.out.printf("  Kuvvet (F = m*a)          : %.2f N\n", force);
        System.out.printf("  Is (W = F*d)              : %.2f J\n", work);
        System.out.printf("  Guc (P = W/t)             : %.2f W\n", power);

        System.out.println("\nENERJI:");
        System.out.printf("  Kinetik Enerji (KE)       : %.2f J\n", kineticEnergy);
        System.out.printf("  Potansiyel Enerji (PE)    : %.2f J\n", potentialEnergy);
        // Toplam enerji = KE + PE
        System.out.printf("  Toplam Enerji             : %.2f J\n", (kineticEnergy + potentialEnergy)); 

        System.out.println("\nMOMENTUM:");
        System.out.printf("  Momentum (p = m*v)        : %.2f kg·m/s\n", momentum);

        System.out.println("\n========================================");

        input.close();
    }
}

ÖDEV JAVA KODU YAZ 


    import java.util.Scanner;

public class SepetHesap {

    // Sabitler
    final static double VAT_RATE = 0.18;      // KDV Oranı (%18)
    final static double SHIPPING_FEE = 29.99; // Sabit kargo ücreti (TL)
    final static double FREE_SHIPPING_LIMIT = 300.0; // Ücretsiz kargo limiti (TL)

    // METOT 1: Bir ürünün toplam fiyatını hesaplar (fiyat * adet)
    public static double calculateLineTotal(double price, int quantity) {
        return price * quantity;
    }

    // METOT 2: Sepetteki 3 ürünün ara toplamını hesaplar
    public static double calculateSubtotal(double line1, double line2, double line3) {
        return line1 + line2 + line3;
    }

    // METOT 3: İndirim tutarını hesaplar
    public static double calculateDiscountAmount(double subtotal, double discountPercentage) {
        return subtotal * (discountPercentage / 100.0);
    }

    // METOT 4: İndirimli fiyatı hesaplar
    public static double applyDiscount(double subtotal, double discountAmount) {
        return subtotal - discountAmount;
    }

    // METOT 5: KDV tutarını hesaplar
    public static double calculateVAT(double discountedTotal, double vatRate) {
        return discountedTotal * vatRate;
    }

    // METOT 6: Genel toplamı hesaplar
    public static double calculateGrandTotal(double discountedTotal, double vatAmount, double shippingFee) {
        return discountedTotal + vatAmount + shippingFee;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== 🛒 E-TICARET SEPET HESAPLAYICI ===");
        System.out.println("\nLütfen 3 ürünün bilgilerini girin:");

        // Ürün Bilgileri
        System.out.println("\nÜRÜN 1:");
        System.out.print("  Birim Fiyat (TL): ");
        double price1 = input.nextDouble();
        System.out.print("  Adet: ");
        int qty1 = input.nextInt();

        System.out.println("\nÜRÜN 2:");
        System.out.print("  Birim Fiyat (TL): ");
        double price2 = input.nextDouble();
        System.out.print("  Adet: ");
        int qty2 = input.nextInt();

        System.out.println("\nÜRÜN 3:");
        System.out.print("  Birim Fiyat (TL): ");
        double price3 = input.nextDouble();
        System.out.print("  Adet: ");
        int qty3 = input.nextInt();

        System.out.print("\nİndirim Kuponu Yüzdesi (%): ");
        double discountPercent = input.nextDouble();

        // === HESAPLAMALAR ===

        double line1Total = calculateLineTotal(price1, qty1);
        double line2Total = calculateLineTotal(price2, qty2);
        double line3Total = calculateLineTotal(price3, qty3);

        double subtotal = calculateSubtotal(line1Total, line2Total, line3Total);
        double discountAmount = calculateDiscountAmount(subtotal, discountPercent);
        double discountedTotal = applyDiscount(subtotal, discountAmount);
        double vatAmount = calculateVAT(discountedTotal, VAT_RATE);
        
        // Eğer discountedTotal >= limit ise, 0 çarpılır → ücretsiz
        // Aksi halde 1 çarpılır → normal ücret eklenir
        double shippingFee = SHIPPING_FEE * (discountedTotal < FREE_SHIPPING_LIMIT ? 1 : 0);

        double grandTotal = calculateGrandTotal(discountedTotal, vatAmount, shippingFee);

        // === SONUÇLARI YAZDIR ===
        System.out.println("\n========================================");
        System.out.println("           🧾 SİPARİŞ ÖZETİ");
        System.out.println("========================================");

        System.out.printf("Ürün 1 Toplam (%.2f TL x %d): %.2f TL\n", price1, qty1, line1Total);
        System.out.printf("Ürün 2 Toplam (%.2f TL x %d): %.2f TL\n", price2, qty2, line2Total);
        System.out.printf("Ürün 3 Toplam (%.2f TL x %d): %.2f TL\n", price3, qty3, line3Total);
        System.out.println("----------------------------------------");
        System.out.printf("Ara Toplam                   : %.2f TL\n", subtotal);

        System.out.printf("\nİndirim Tutarı (%%%.0f)         : -%.2f TL\n", discountPercent, discountAmount);
        System.out.printf("İndirimli Toplam             : %.2f TL\n", discountedTotal);

        System.out.printf("\nKDV Tutarı (%%%.0f)             : +%.2f TL\n", (VAT_RATE * 100), vatAmount);
        System.out.printf("Kargo Ücreti                 : +%.2f TL %s\n", shippingFee, (shippingFee == 0 ? "(Ücretsiz 🎁)" : ""));
        System.out.println("----------------------------------------");
        System.out.printf("💰 GENEL TOPLAM               : %.2f TL\n", grandTotal);
        System.out.println("========================================");

        input.close();
    }
}
