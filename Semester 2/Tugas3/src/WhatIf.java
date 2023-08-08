public class WhatIf {
    public static void main( String[] args ) {
        int people = 20;
        int cats = 15;
        int dogs = 15;

        if ( people < cats ) // jika jumlah manusia kurang dari jumlah kucing maka if akan memunculkan kode di bawahanya
        {
            System.out.println( "Too many cats!  The world is doomed!" );
        }

        if ( people < cats ) // fungsi kurung kurawal di if untuk menandai sebuah blok/statment di if
        {
            System.out.println( "Not many cats!  The world is saved!" );
        }

        if ( people < dogs )
        {
            System.out.println( "The world is drooled on!" );
        }

        if ( people > dogs )
        {
            System.out.println( "The world is dry!" );
        }

        dogs += 5;

        if ( people >= dogs )
        {
            System.out.println( "People are greater than or equal to dogs." );
        }

        if ( people <= dogs )
        {
            System.out.println( "People are less than or equal to dogs." );
        }

        if ( people == dogs )
        {
            System.out.println( "People are dogs." );
        }
    }
}