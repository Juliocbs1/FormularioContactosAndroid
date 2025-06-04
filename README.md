# FormularioContactosAndroid

Activity 1: 

Theme:

![image](https://github.com/user-attachments/assets/aa6aec31-936d-4537-a134-2925f34cfbe5)

XML:

<?xml version="1.0" encoding="utf-8"?>

<ScrollView
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:fitsSystemWindows="true"
    >


    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="vertical"
        >
        <com.google.android.material.textfield.TextInputLayout

            android:id="@+id/main_text"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:hint="@string/main_nombre"
            android:labelFor="@+id/main_campo_nombre"
            android:layout_marginTop="10dp">

            <com.google.android.material.textfield.TextInputEditText
                android:id="@+id/main_campo_nombre"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginTop="10dp"
                android:inputType="text"/>
        </com.google.android.material.textfield.TextInputLayout>




        <TextView

            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="@string/main_fecha"
            android:labelFor="@+id/main_fecha"
            android:layout_marginTop="10dp"
            />


        <DatePicker
            android:id="@+id/main_fecha"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginTop="10dp"
            android:dateTextAppearance="@android:style/TextAppearance.Medium"
            android:maxDate="2100-01-01"
            android:minDate="1900-01-01"
            />

        <com.google.android.material.textfield.TextInputLayout

            android:id="@+id/main_text_telefono"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="10dp"
            android:hint="@string/main_telefono"

            >
            <com.google.android.material.textfield.TextInputEditText
                android:id="@+id/main_campo_telefono"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginTop="10dp"
                android:inputType="phone"/>
        </com.google.android.material.textfield.TextInputLayout>



        <com.google.android.material.textfield.TextInputLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:hint="@string/main_email"
            android:labelFor="@+id/main_campo_email"
            android:layout_marginTop="10dp"
            >
            <com.google.android.material.textfield.TextInputEditText
                android:id="@id/main_campo_email"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginTop="10dp"

                />

        </com.google.android.material.textfield.TextInputLayout>



        <com.google.android.material.textfield.TextInputLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:hint="@string/main_descripcion_contacto"
            android:labelFor="@+id/main_campo_descripcion"
            android:layout_marginTop="10dp"
            >

            <com.google.android.material.textfield.TextInputEditText
                android:id="@+id/main_campo_descripcion"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginTop="10dp"
                android:inputType="text"/>
        </com.google.android.material.textfield.TextInputLayout>






        <Button
            android:id="@+id/main_boton"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="@string/main_boton"
            android:layout_marginTop="10dp"


            />



    </LinearLayout>
</ScrollView>




![image](https://github.com/user-attachments/assets/ce88e23f-d01c-4e34-9fc6-71e165c7ebff)
![image](https://github.com/user-attachments/assets/50393985-3830-4215-b552-3e72b8447183)


Activity 2:

XML:

<?xml version="1.0" encoding="utf-8"?>
<androidx.appcompat.widget.LinearLayoutCompat xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:fitsSystemWindows="true"
    >
    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/detalle_titulo"
        />

    <TextView
        android:id="@+id/detalle_nombre"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/detalle_nombre"
        />

    <TextView
        android:id="@+id/detalle_fecha"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/detalle_fecha"
        />

    <TextView
        android:id="@+id/detalle_telefono"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/detalle_telefono"
        />

    <TextView
        android:id="@+id/detalle_email"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/detalle_email"/>

    <TextView
        android:id="@+id/detalle_descripcion_contacto"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/detalle_descripcion_contacto"
        />

    <Button
        android:id="@+id/detalle_boton"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/detalle_boton"
        />






</androidx.appcompat.widget.LinearLayoutCompat>

![image](https://github.com/user-attachments/assets/4963ff6a-0b8e-4bd2-b230-552afa26609d)


