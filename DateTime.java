        int month = in.nextInt()-1;
        int day = in.nextInt();
        int year = in.nextInt();
        Date date = (new GregorianCalendar(year,month,day)).getTime();
        SimpleDateFormat f=new SimpleDateFormat("EEEE");
        String dn=f.format(date);
        System.out.println(dn.toUpperCase());
