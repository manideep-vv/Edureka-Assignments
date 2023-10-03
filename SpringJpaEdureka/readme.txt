create customer
=================
{
    "name":"manideep"   
}
{
    "name":"sai prakash"   
}
create product- no need to create category seperately as this will be cascaded/insert automatically due to cascade type
==============
{

    "name":"keyboard",
    "price": 550.263,
    "category":{
        "name":"electronics"
    }
}
{

    "name":"cellphone",
    "price": 111.263,
    "category":{
        "name":"electronics"
    }
}
{

    "name":"shirt",
    "price": 111.22,
    "category":{
        "name":"clothes"
    }
}
{

    "name":"pant",
    "price": 222.33,
    "category":{
        "name":"clothes"
    }
}
create order
=============
{

    "quantity":2,
    "product":{
        "id":13
    },
    "customer":{
        "id":20
    }
}

update order
=======
{
    "id":21,
    "quantity":20,
    "product":{
        "id":13
    },
    "customer":{
        "id":20
    }
}