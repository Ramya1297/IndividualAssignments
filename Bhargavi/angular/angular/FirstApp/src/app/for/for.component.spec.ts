import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ForComponent } from './for.component';

describe('ForComponent', () => {
  let component: ForComponent;
  let fixture: ComponentFixture<ForComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ForComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ForComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
