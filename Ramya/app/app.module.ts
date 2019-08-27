import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TransferComponent } from './transfer/transfer.component';
import {FormsModule} from '@angular/forms';
import { ValidateAccountPipe } from './validate-account.pipe';
import { CheckMatchPipe } from './check-match.pipe';
import { DifferPipe } from './differ.pipe';
import { DisableRightClickDirective } from './disable-right-click.directive';
import { HttpClientModule } from '@angular/common/http'; 
@NgModule({
  declarations: [
    AppComponent,
    TransferComponent,
    ValidateAccountPipe,
    CheckMatchPipe,
    DifferPipe,
    DisableRightClickDirective
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule 
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { 
  
}

