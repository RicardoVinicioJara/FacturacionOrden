PGDMP     2                
    x            BaseMaquinasElectricas    13beta3    13beta3 !    \           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            ]           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            ^           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            _           1262    265630    BaseMaquinasElectricas    DATABASE     |   CREATE DATABASE "BaseMaquinasElectricas" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'English_United States.1252';
 (   DROP DATABASE "BaseMaquinasElectricas";
                postgres    false            �            1255    265702 
   bitacora()    FUNCTION       CREATE FUNCTION public.bitacora() RETURNS trigger
    LANGUAGE plpgsql
    AS $$
    BEGIN
        IF (TG_OP = 'UPDATE') THEN
			if(old."proStock" < new."proStock") THEN
            INSERT INTO public."BitacoraStock"("bitId", "bitFecha", "bitProducto", "bitAccion", "bitCant")
			VALUES ((SELECT MAX("bitId") FROM Public."BitacoraStock")+1, current_timestamp, old."proId",'INGRESA MAS PRODUCTOS',new."proStock" - old."proStock");
			ELSE 
			INSERT INTO public."BitacoraStock"("bitId", "bitFecha", "bitProducto", "bitAccion", "bitCant")
			VALUES ((SELECT MAX("bitId") FROM Public."BitacoraStock")+1, current_timestamp, old."proId",'SALEN PRODUCTOS',old."proStock" - new."proStock");
            RETURN NEW;
			END IF;
        ELSEIF (TG_OP = 'INSERT') THEN
            INSERT INTO public."BitacoraStock"("bitId", "bitFecha", "bitProducto", "bitAccion", "bitCant")
			VALUES ((SELECT MAX("bitId") FROM Public."BitacoraStock")+1, current_timestamp, NEW."proId",'INGRESA NUEVOS PRODUCTOS',new."proStock" );
        END IF;
        RETURN NULL;
    END;
$$;
 !   DROP FUNCTION public.bitacora();
       public          postgres    false            �            1259    265689    BitacoraStock    TABLE     �   CREATE TABLE public."BitacoraStock" (
    "bitId" numeric NOT NULL,
    "bitFecha" date NOT NULL,
    "bitProducto" numeric,
    "bitAccion" text NOT NULL,
    "bitCant" numeric
);
 #   DROP TABLE public."BitacoraStock";
       public         heap    postgres    false            �            1259    265631    Clientes    TABLE     �   CREATE TABLE public."Clientes" (
    "cliId" numeric NOT NULL,
    "cliNombre" text NOT NULL,
    "cliApellido" text NOT NULL,
    "cliCedula" text NOT NULL,
    "cliTelefono" text,
    "cliDireccion" text,
    "cliCorreo" text
);
    DROP TABLE public."Clientes";
       public         heap    postgres    false            �            1259    265681    Detalle    TABLE     �   CREATE TABLE public."Detalle" (
    "deId" numeric NOT NULL,
    "deProducto" numeric NOT NULL,
    "deCantidad" numeric NOT NULL,
    "deFactura" numeric NOT NULL
);
    DROP TABLE public."Detalle";
       public         heap    postgres    false            �            1259    265639 	   Empleados    TABLE     �   CREATE TABLE public."Empleados" (
    "emId" numeric NOT NULL,
    "emNombre" text NOT NULL,
    "emApellido" text NOT NULL,
    "emCedula" text NOT NULL,
    "emTelefono" text NOT NULL,
    "emCorreo" text,
    "emDireccion" text
);
    DROP TABLE public."Empleados";
       public         heap    postgres    false            �            1259    265704    Factura    TABLE     �   CREATE TABLE public."Factura" (
    cliente text,
    "faId" numeric(8,0) NOT NULL,
    iva numeric(8,2),
    subtotal numeric(8,2),
    total numeric(8,2),
    notas text,
    fecha date
);
    DROP TABLE public."Factura";
       public         heap    postgres    false            �            1259    265663    OrdenTrabajo    TABLE     �  CREATE TABLE public."OrdenTrabajo" (
    "otId" numeric NOT NULL,
    "otFechaIni" date,
    "otCliente" numeric NOT NULL,
    "otEmpleado" numeric NOT NULL,
    "otTotal" double precision NOT NULL,
    "otAbono" double precision NOT NULL,
    "otSaldo" double precision NOT NULL,
    "otObservaciones" text,
    "otCaracteristicas" text NOT NULL,
    "otNumeroSerie" text,
    "otDesTrabajo" text NOT NULL,
    "otFechaFin" date,
    "otNotas" text
);
 "   DROP TABLE public."OrdenTrabajo";
       public         heap    postgres    false            �            1259    265647    Producto    TABLE     �   CREATE TABLE public."Producto" (
    "proId" numeric NOT NULL,
    "proNombre" text NOT NULL,
    "proCodigo" text,
    "proMedida" text NOT NULL,
    "proStock" numeric NOT NULL,
    "proPrecio" double precision NOT NULL
);
    DROP TABLE public."Producto";
       public         heap    postgres    false            �            1259    265655    Trabajos    TABLE     �   CREATE TABLE public."Trabajos" (
    "trabajosId" numeric NOT NULL,
    "traNombre" text NOT NULL,
    "traPrecio" double precision NOT NULL
);
    DROP TABLE public."Trabajos";
       public         heap    postgres    false            X          0    265689    BitacoraStock 
   TABLE DATA           e   COPY public."BitacoraStock" ("bitId", "bitFecha", "bitProducto", "bitAccion", "bitCant") FROM stdin;
    public          postgres    false    206   �,       R          0    265631    Clientes 
   TABLE DATA           �   COPY public."Clientes" ("cliId", "cliNombre", "cliApellido", "cliCedula", "cliTelefono", "cliDireccion", "cliCorreo") FROM stdin;
    public          postgres    false    200   -       W          0    265681    Detalle 
   TABLE DATA           T   COPY public."Detalle" ("deId", "deProducto", "deCantidad", "deFactura") FROM stdin;
    public          postgres    false    205   �-       S          0    265639 	   Empleados 
   TABLE DATA           |   COPY public."Empleados" ("emId", "emNombre", "emApellido", "emCedula", "emTelefono", "emCorreo", "emDireccion") FROM stdin;
    public          postgres    false    201   �-       Y          0    265704    Factura 
   TABLE DATA           X   COPY public."Factura" (cliente, "faId", iva, subtotal, total, notas, fecha) FROM stdin;
    public          postgres    false    207   �-       V          0    265663    OrdenTrabajo 
   TABLE DATA           �   COPY public."OrdenTrabajo" ("otId", "otFechaIni", "otCliente", "otEmpleado", "otTotal", "otAbono", "otSaldo", "otObservaciones", "otCaracteristicas", "otNumeroSerie", "otDesTrabajo", "otFechaFin", "otNotas") FROM stdin;
    public          postgres    false    204   ".       T          0    265647    Producto 
   TABLE DATA           m   COPY public."Producto" ("proId", "proNombre", "proCodigo", "proMedida", "proStock", "proPrecio") FROM stdin;
    public          postgres    false    202   ?.       U          0    265655    Trabajos 
   TABLE DATA           L   COPY public."Trabajos" ("trabajosId", "traNombre", "traPrecio") FROM stdin;
    public          postgres    false    203   w.       �
           2606    265696     BitacoraStock BitacoraStock_pkey 
   CONSTRAINT     g   ALTER TABLE ONLY public."BitacoraStock"
    ADD CONSTRAINT "BitacoraStock_pkey" PRIMARY KEY ("bitId");
 N   ALTER TABLE ONLY public."BitacoraStock" DROP CONSTRAINT "BitacoraStock_pkey";
       public            postgres    false    206            �
           2606    265638    Clientes Clientes_pkey 
   CONSTRAINT     ]   ALTER TABLE ONLY public."Clientes"
    ADD CONSTRAINT "Clientes_pkey" PRIMARY KEY ("cliId");
 D   ALTER TABLE ONLY public."Clientes" DROP CONSTRAINT "Clientes_pkey";
       public            postgres    false    200            �
           2606    265688    Detalle Detalle_pkey 
   CONSTRAINT     Z   ALTER TABLE ONLY public."Detalle"
    ADD CONSTRAINT "Detalle_pkey" PRIMARY KEY ("deId");
 B   ALTER TABLE ONLY public."Detalle" DROP CONSTRAINT "Detalle_pkey";
       public            postgres    false    205            �
           2606    265646    Empleados Empleados_pkey 
   CONSTRAINT     ^   ALTER TABLE ONLY public."Empleados"
    ADD CONSTRAINT "Empleados_pkey" PRIMARY KEY ("emId");
 F   ALTER TABLE ONLY public."Empleados" DROP CONSTRAINT "Empleados_pkey";
       public            postgres    false    201            �
           2606    265711    Factura Factura_pkey 
   CONSTRAINT     Z   ALTER TABLE ONLY public."Factura"
    ADD CONSTRAINT "Factura_pkey" PRIMARY KEY ("faId");
 B   ALTER TABLE ONLY public."Factura" DROP CONSTRAINT "Factura_pkey";
       public            postgres    false    207            �
           2606    265670    OrdenTrabajo OrdenTrabajo_pkey 
   CONSTRAINT     d   ALTER TABLE ONLY public."OrdenTrabajo"
    ADD CONSTRAINT "OrdenTrabajo_pkey" PRIMARY KEY ("otId");
 L   ALTER TABLE ONLY public."OrdenTrabajo" DROP CONSTRAINT "OrdenTrabajo_pkey";
       public            postgres    false    204            �
           2606    265654    Producto Producto_pkey 
   CONSTRAINT     ]   ALTER TABLE ONLY public."Producto"
    ADD CONSTRAINT "Producto_pkey" PRIMARY KEY ("proId");
 D   ALTER TABLE ONLY public."Producto" DROP CONSTRAINT "Producto_pkey";
       public            postgres    false    202            �
           2606    265662    Trabajos Trabajos_pkey 
   CONSTRAINT     b   ALTER TABLE ONLY public."Trabajos"
    ADD CONSTRAINT "Trabajos_pkey" PRIMARY KEY ("trabajosId");
 D   ALTER TABLE ONLY public."Trabajos" DROP CONSTRAINT "Trabajos_pkey";
       public            postgres    false    203            �
           2620    265703    Producto auditoria    TRIGGER     �   CREATE TRIGGER auditoria AFTER INSERT OR UPDATE OF "proStock" ON public."Producto" FOR EACH ROW EXECUTE FUNCTION public.bitacora();
 -   DROP TRIGGER auditoria ON public."Producto";
       public          postgres    false    202    202    208            �
           2606    265671    OrdenTrabajo fkCliente    FK CONSTRAINT     �   ALTER TABLE ONLY public."OrdenTrabajo"
    ADD CONSTRAINT "fkCliente" FOREIGN KEY ("otCliente") REFERENCES public."Clientes"("cliId");
 D   ALTER TABLE ONLY public."OrdenTrabajo" DROP CONSTRAINT "fkCliente";
       public          postgres    false    200    204    2749            �
           2606    265676    OrdenTrabajo fkEmpleado    FK CONSTRAINT     �   ALTER TABLE ONLY public."OrdenTrabajo"
    ADD CONSTRAINT "fkEmpleado" FOREIGN KEY ("otEmpleado") REFERENCES public."Empleados"("emId");
 E   ALTER TABLE ONLY public."OrdenTrabajo" DROP CONSTRAINT "fkEmpleado";
       public          postgres    false    201    204    2751            �
           2606    265697    BitacoraStock forenProducto    FK CONSTRAINT     �   ALTER TABLE ONLY public."BitacoraStock"
    ADD CONSTRAINT "forenProducto" FOREIGN KEY ("bitProducto") REFERENCES public."Producto"("proId");
 I   ALTER TABLE ONLY public."BitacoraStock" DROP CONSTRAINT "forenProducto";
       public          postgres    false    202    206    2753            X   S   x�U��� @�s;`�:AbHHk�xb�9�����Pd�L0��\e���OAGy�����6&"���S+���!����      R   n   x���
�0 �s��I�U��HFQ	(v^,���}���{�A��p�Q�Np���K㚁�����+���eX�~?0H�=F�A������De����JG���=��p9      W      x�3�4�44�4����� '�      S      x������ � �      Y   8   x�3�4�4420�30�441S��9?O�$�(+�$Q�����@��P�Ѐ+F��� 9�I      V      x������ � �      T   (   x�3�,H��442���tqtq洴��440������ v�m      U      x������ � �     