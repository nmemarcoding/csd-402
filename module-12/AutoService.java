public class AutoService {
    // Constants for service charges
    private static final double STANDARD_SERVICE = 89.99;
    private static final double OIL_CHANGE = 29.99;
    private static final double TIRE_ROTATION = 19.99;
    
    // Basic service - no parameters
    public static double yearlyService() {
        return STANDARD_SERVICE;
    }
    
    // Service with oil change
    public static double yearlyService(boolean oilChange) {
        return STANDARD_SERVICE + (oilChange ? OIL_CHANGE : 0);
    }
    
    // Service with oil change and tire rotation
    public static double yearlyService(boolean oilChange, boolean tireRotation) {
        return STANDARD_SERVICE + 
               (oilChange ? OIL_CHANGE : 0) + 
               (tireRotation ? TIRE_ROTATION : 0);
    }
    
    // Service with oil change, tire rotation, and coupon
    public static double yearlyService(boolean oilChange, boolean tireRotation, double coupon) {
        return STANDARD_SERVICE + 
               (oilChange ? OIL_CHANGE : 0) + 
               (tireRotation ? TIRE_ROTATION : 0) - 
               coupon;
    }
}
