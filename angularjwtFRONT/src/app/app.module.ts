import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

// Modulos para el cliente http y los formularios

import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { ListaProductoComponent } from './productos/lista-producto.component';
import { HomeComponent } from './home/home.component';
import { DetalleProductoComponent } from './productos/detalle-producto.component';
import { NuevoProductoComponent } from './productos/nuevo-producto.component';
import { EditarProductoComponent } from './productos/editar-producto.component';
import { LoginComponent } from './auth/login.component';
import { interceptorProvider } from './interceptors/producto-interceptor.service';
import { UserComponent } from './users/user.component';
import { AdminComponent } from './users/admin.component';
import { RegistroComponent } from './auth/registro.component';

@NgModule({
  declarations: [
    AppComponent,
    ListaProductoComponent,
    HomeComponent,
    DetalleProductoComponent,
    NuevoProductoComponent,
    EditarProductoComponent,
    LoginComponent,
    UserComponent,
    AdminComponent,
    RegistroComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [interceptorProvider],
  bootstrap: [AppComponent]
})
export class AppModule { }
