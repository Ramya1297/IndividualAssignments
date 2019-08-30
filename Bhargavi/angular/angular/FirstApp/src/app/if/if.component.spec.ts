import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { IfComponent } from './if.component';

describe('IfComponent', () => {
  let component: IfComponent;
  let fixture: ComponentFixture<IfComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ IfComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(IfComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
