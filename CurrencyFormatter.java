        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        NumberFormat nfs=NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat nfc=NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat nff=NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat nfi=NumberFormat.getCurrencyInstance(new Locale("en","in"));
        
        String us=nfs.format(payment);
        String china=nfc.format(payment);
        String france=nff.format(payment);
        String india=nfi.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
