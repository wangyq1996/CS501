public class C4E3GPS {
    public static void main(String []args){
        double Cx = 35.2270869;
        double Cy = -80.84321267;
        double Sx = 32.0835407;
        double Sy = -81.0998342;
        double Ox = 28.5383355;
        double Oy = -81.3792365;
        double Ax = 33.7489954;
        double Ay = -84.3879824;
        double radius = 6371.01;
        double CS = radius * Math.acos(Math.sin(Math.toRadians(Cx)) * Math.sin(Math.toRadians(Sx)) + Math.cos(Math.toRadians(Cx)) * Math.cos(Math.toRadians(Sx)) * Math.cos(Math.toRadians(Cy - Sy)));
        double SO = radius * Math.acos(Math.sin(Math.toRadians(Sx)) * Math.sin(Math.toRadians(Ox)) + Math.cos(Math.toRadians(Sx)) * Math.cos(Math.toRadians(Ox)) * Math.cos(Math.toRadians(Sy - Oy)));
        double AO = radius * Math.acos(Math.sin(Math.toRadians(Ax)) * Math.sin(Math.toRadians(Ox)) + Math.cos(Math.toRadians(Ax)) * Math.cos(Math.toRadians(Ox)) * Math.cos(Math.toRadians(Ay - Oy)));
        double AC = radius * Math.acos(Math.sin(Math.toRadians(Ax)) * Math.sin(Math.toRadians(Cx)) + Math.cos(Math.toRadians(Ax)) * Math.cos(Math.toRadians(Cx)) * Math.cos(Math.toRadians(Ay - Cy)));
        double CO = radius * Math.acos(Math.sin(Math.toRadians(Cx)) * Math.sin(Math.toRadians(Ox)) + Math.cos(Math.toRadians(Cx)) * Math.cos(Math.toRadians(Ox)) * Math.cos(Math.toRadians(Cy - Oy)));
        double s1 = ( CS + SO + CO ) / 2;
        double area1 = Math.pow((s1 * ( s1 - CS ) * ( s1 - SO ) * ( s1 - CO )), 0.5);
        double s2 = ( AC + AO + CO ) / 2;
        double area2 = Math.pow((s2 * ( s2 - AC ) * ( s2 - AO ) * ( s2 - CO )), 0.5);
        System.out.println(area1+area2);
    }
}
